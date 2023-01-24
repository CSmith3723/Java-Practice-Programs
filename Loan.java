//package
package javacourse.cop2805;

//importa java utilities
import java.util.*;

// Implements Seriablizable to support object IO  
public class Loan implements java.io.Serializable {
	
	//main method
	public static void main (String[] args) {
		
	//loan object
	Loan loan = new Loan();
	
	//new Scanner
	Scanner input = new Scanner(System.in);
	
	//Prompts user for annual interest rate
	System.out.println("Please enter the annual interest rate: ");
	
	//set user input to annualInterestRate variable
	double annualInterestRate = input.nextDouble();
	
	//use setter method to set annual interest rate
	loan.setAnnualInterestRate(annualInterestRate);
	
	//prompt user for loan amount
	System.out.println("Please enter the loan amount: ");
	
	//set user input to loanAmount variable
	double loanAmount = input.nextDouble();
	
	//use setter method to set loan amount
	loan.setLoanAmount(loanAmount);
	
	//prompt user for number of years over which loan will be repaid
	System.out.println("Please enter the number of years the loan will be repaid over: ");
	
	//set user input to numberOfYears variable
	int numberOfYears = input.nextInt();
	
	//use setter method to set number of years
	loan.setNumberOfYears(numberOfYears);
	
	//output the total payment using the getTotalPayment method, formatted to 2 decimal spaces
	System.out.print("Your total payment is: ");
	System.out.printf("%.2f", loan.getTotalPayment());
	
	}
	
	//declare variables
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  /** Default constructor */
  public Loan() {
    this(2.5, 1, 1000);
  }

  /** Construct a loan with specified annual interest rate,
      number of years and loan amount
    */
  public Loan(double annualInterestRate, int numberOfYears,
      double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }

  /** Return annualInterestRate */
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate) 
		  throws IllegalArgumentException { //throw illegal argument exception if interest rate is less than or equal to 0
	  	if (annualInterestRate > 0)
		  this.annualInterestRate = annualInterestRate;
	  	else 
	  		throw new IllegalArgumentException (
	  			"Interest rate cannot be 0 or negative.");
  }

  /** Return numberOfYears */
  public int getNumberOfYears() {
    return numberOfYears;
  }

  /** Set a new numberOfYears */
  public void setNumberOfYears(int numberOfYears) 
		  throws IllegalArgumentException { //throw illegal argument exception if number of years is less than or equal to 0
	  	if (numberOfYears > 0)
		  this.numberOfYears = numberOfYears;
	  	else 
	  		throw new IllegalArgumentException (
	  			"Number of years cannot be 0 or negative."); 
  }

  /** Return loanAmount */
  public double getLoanAmount() {
    return loanAmount;
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double loanAmount)  
		  throws IllegalArgumentException { //throw illegal argument exception if loan amount is less than or equal to 0
	  	if (loanAmount > 0)
		  this.loanAmount = loanAmount;
	  	else 
	  		throw new IllegalArgumentException (
	  			"Loan amount cannot be 0 or negative.");
  }

  /** Find monthly payment */
  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
      (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
    return monthlyPayment;    
  }

  /** Find total payment */
  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;    
  }

  /** Return loan date */
  public java.util.Date getLoanDate() {
    return loanDate;
  }
}
