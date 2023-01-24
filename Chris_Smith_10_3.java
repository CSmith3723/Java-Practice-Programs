package cop2800;

//Importa java utilities for Scanner
import java.util.*;

//Main public class. Chris Smith, Assignment 10.3
public class Chris_Smith_10_3 {

	//Main method
	public static void main(String[] args) {
		
	//Prompt user for an integer
	System.out.println("Please enter an integer:");
	
	//New scanner
	Scanner input = new Scanner(System.in);
	
	//Create variable to hold user input
	int userInput = input.nextInt();
	
	//Create double variable to allow MyInteger method to be tested below.
	double userInput1 = userInput;
	
	//Call MyInteger class to assign user input
	MyInteger myInteger1 = new MyInteger(userInput);
	
	//Testing the methods in the MyInteger class
	
	//Testing the methods that take no argument
	System.out.println(myInteger1.isEven());
	System.out.println(myInteger1.isOdd());
	
	//Testing the methods that take an int argument. >>>>>> Eclipse told me I should call these methods in a static way directly from MyInteger, rather than using myInteger1, so that's why it's like this. 
	System.out.println(MyInteger.isEven(userInput));
	System.out.println(MyInteger.isOdd(userInput));
	
	//Testing the methods that take MyInteger as an argument. 
	System.out.println(MyInteger.isEven(userInput1));
	System.out.println(MyInteger.isOdd(userInput1));
	
	//Testing to see if user input value for 'value' and 'MyInteger' is equal to the special value
	System.out.println(myInteger1.equals(userInput));
	System.out.println(myInteger1.equals(userInput1));
	
	
	//Close the scanner
	input.close();
	}

}


//Creating MyInteger class. 
class MyInteger {
	
	//Create variable to hold int value.
	int value = '\u0000'; 
	
	//Constructor myInteger for the int value
	MyInteger(int newValue){
		value = newValue;
	}
	
	//Getter method to return the int value
	int getValue(){
		return value;
	}
	
	//isEven method testing if value is even. Number divisible by 2 is even. 
	boolean isEven(){
		if (value % 2 == 0)
			return true;
		else return false;
	}
	
	//isOdd method testing if value is odd. Number not divisible by 2 is odd.
	boolean isOdd(){
		if (value % 2 == 1)
			return true;
		else return false;
	}
	
	//static isEven method.
	public static boolean isEven(int value){
		if (value % 2 == 0)
			return true;
		else return false;
	}
	
	//static isOdd method.
	public static boolean isOdd(int value) {
		if (value % 2 == 1)
			return true;
		else return false;
	}
	
	//static isOdd method to test if MyInteger value is even
	public static boolean isEven(double MyInteger){
		if (MyInteger % 2 == 0)
			return true;
		else return false;
	}
	
	//Static isOdd method to test if MyInteger value is odd
	public static boolean isOdd(double MyInteger){
		if (MyInteger % 2 == 1)
			return true;
		else return false;
	}
	
	//Assigning special value to check equals() method
	int specialValue = 10;
	
	//Boolean method to check if user input is equal to special value.
	boolean equals(int value) {
		if (value == specialValue)
			return true;
		else return false;
	}
	
	//Boolean method to check if MyInteger value is equal to special value. 
	boolean equals(double MyInteger) {
		if (MyInteger == specialValue)
			return true;
		else return false;
	}
	
}


