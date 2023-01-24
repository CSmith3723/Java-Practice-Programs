package javacourse.cop2805;

//Chris Smith Java recap 9.7

import java.util.Date;

public class CSmith_Account {

    public static void main(String[] args) throws Exception{

        int id = 1122;
        
        double balance = 20000; 

        double annualInterestRate = 4.5;

        CSmith_Account accountInfo = new CSmith_Account();
        accountInfo.getMonthlyInterestRate(annualInterestRate);
        accountInfo.setID(id);
        accountInfo.setBalance(balance);
        
        System.out.print("The account ID is " + accountInfo.getID() + ", the account balance is $");
        System.out.printf("%.2f", accountInfo.getBalance());
        System.out.print(" and the monthly interest is $");
        System.out.printf("%.2f", accountInfo.getMonthlyInterest(monthlyInterestRate));
        System.out.println(". The account was created on " + accountInfo.dateCreated(dateCreated) + ".");
        
        accountInfo.deposit(3000, 20000);
        accountInfo.withdraw(2500, 20000);

        System.out.print("The new balance after a withrawal of $2500 and a deposit of $3000 is $");
        System.out.printf("%.2f", accountInfo.getNewBalance());  
        System.out.println(".");
        
        System.out.println(accountInfo.toString());
        
        
    }

    //create private int id variable. Not sure why it says it is unused.
    private int id;

    private double balance;

    private double annualInterestRate;

    private static java.util.Date dateCreated = new java.util.Date(); 

    public static double monthlyInterestRate;

    public double monthlyInterest;

    public double deposit;

    public double withdrawal;

    public static double newBalance;

    CSmith_Account(){  
    }

    CSmith_Account(int id , double balance, double annualInterestRate, double monthlyInterest, double deposit, double withdrawal){ 
       this.id = id;
       this.balance = balance;
       this.annualInterestRate = annualInterestRate;
       this.monthlyInterest = monthlyInterest;
       this.deposit = deposit;
       this.withdrawal = withdrawal;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(double annualInterestRate){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public Date dateCreated(Date dateCreated){
        return dateCreated;
    }

    public double getMonthlyInterestRate(double annualInterestRate){
        monthlyInterestRate = (annualInterestRate/12) / 100;
        return monthlyInterestRate;
    }

    public double getMonthlyInterest(double monthlyInterestRate){
        monthlyInterest = monthlyInterestRate * balance;
        return monthlyInterest;
    }

    public double deposit(double deposit, double balance){
        newBalance = balance + deposit;
        return newBalance;
    }

    public double withdraw(double withdrawal, double balance){
        newBalance = balance - withdrawal;
        return newBalance;
    }
    
    public void setNewBalance(double newBalance) {
    	balance = newBalance;
    }
    
    public double getNewBalance() {
    	return newBalance;
    }

    public String toString() {
    	return "The account ID is " + getID() + " and the account balance is " + getNewBalance() + ".";
    }
}
