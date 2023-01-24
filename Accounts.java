package javacourse.cop2805;

//ChrisSmith 11.3 Accounts
import java.util.*;

//public class Accounts. Main class
public class Accounts {

    public static void main(String[] args) throws Exception{ //main method

    	
        Accounts accountInfo = new Accounts(); //Accounts object
        
        int id = 1001; 	//initializing variable id for account
        double balance = 15000.00; //initializing balance var for account
        
        accountInfo.setID(id); 	//setting id using object
        accountInfo.setBalance(balance); //setting balance using object 
        
        System.out.println(accountInfo.toString()); //call toString method using object to display account info
        
        
        CheckingAccount checkAcct = new CheckingAccount(); //new CheckingAccount object
        
        Scanner input = new Scanner(System.in); //new scanner
    	
    	System.out.println("Please enter your checking account ID: "); //prompt user for checking account id input
        
    	int checkingID = input.nextInt();        //assign input to temp var
        id = checkingID; 						//assign var data to id var
        
        balance = 500;	//set value to balance var
        
        checkAcct.setBalance(balance); //pass balance as param for setBalance method in checking account 
        checkAcct.setCheckingID(id); //pass id as param for setID method in checking account
        
        System.out.println("Please write how much money you would like to withdraw from your checking account: "); //prompt user for amount to withdraw from account
        
        double withdrawal = input.nextDouble(); //set input to withdrawal var
        
        checkAcct.withdraw(withdrawal, balance); //invoke withdraw method to calculate new balance
        
        checkAcct.getNewBalance(); //get new balance
        
        if (newBalance < -200) { //if statement to prevent withdrawals from overdrafting the checking account below -200
        	System.out.println("Your checking account funds are not permitted to be drawn below $-200."); //error message
        	checkAcct.setBalance(balance); //resets balance to amount prior to withdrawal
        }
        
        else System.out.println(checkAcct.toString()); //else statement to invoke checking accounts overridden toString method
        
        
        SavingsAccount saveAcct = new SavingsAccount(); //savings account object
        
        System.out.println("Please enter your savings account ID: "); //prompt user for savings account id
        
        int savingsID = input.nextInt(); //assign input to temporary savingsID var
        id = savingsID; 	//assign savingsID to id var
        
        balance = 11000.00; //set balance to 11000
        
        saveAcct.setBalance(balance); //invoke set balance method for savings acct and pass balance as param
        saveAcct.setSavingsID(id); //set savings id using object and method
        
        System.out.println("Please write how much money you would like to withdraw from your savings account:"); //prompt user for amount to withdraw from savings acct
        
        double saveWithdrawal = input.nextDouble(); //assign input to saveWithdrawal var
        withdrawal = saveWithdrawal; //assign saveWithdrawal to withdrawal var
        
        saveAcct.withdraw(withdrawal, balance); //invoke withdraw method for SavingsAccount using object and pass withdrawal and balance as param
        
        saveAcct.getNewBalance(); //invoke getNewBalance method for savings account
        
        if(newBalance < 0) { //if statement to prevent user from overdrafting their savings account
        	System.out.println("Your savings account funds may not be overdrawn."); //error message
        	saveAcct.setBalance(balance); //setting balance in savings account to amount prior to withdrawal
        }
        
        else System.out.println(saveAcct.toString()); //else statement for toString 
        
        input.close(); //close input
        
    }
  
    private int id;

    private double balance;

    private double annualInterestRate;

    private static java.util.Date dateCreated = new java.util.Date(); 

    public static double monthlyInterestRate;

    public double monthlyInterest;

    public double deposit;

    public double withdrawal;

    public static double newBalance;

    Accounts(){  
    }

    Accounts(int id , double balance, double annualInterestRate, double monthlyInterest, double deposit, double withdrawal){ 
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
    	return "The account ID is " + getID() + " and the account balance is " + getBalance() + ".";
    }
}


class CheckingAccount extends Accounts{
		
	int checkingID;

	
	public void setCheckingID(int id) {
		checkingID = id;
	}
	
	public int getCheckingID() {
		return checkingID;
	}
	
	@Override
	public String toString() {
		return "The ID for this checking account is " + getCheckingID() + " and account balance is " + getNewBalance() + ".";
	}
	
}

class SavingsAccount extends Accounts{
	
	int savingsID;
	
	public void setSavingsID(int id) {
		savingsID = id;
	}
	
	public int getSavingsID() {
		return savingsID;
	}
	
	@Override
	public String toString() {
		return "The ID for this savings account is " + getSavingsID() + " and the account balance is " + getNewBalance() + ".";			
	}
	
}