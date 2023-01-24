//package
package javacourse.cop2805;

//import java utilities
import java.util.*;

//main class
public class CSmith_12_3 {

	//main method
	public static void main(String[] args) {
				
		//initialize integer array with 100 elements
		int[] arrayOneHundred = new int[100];
				
		//for loop to fill array with random integers with values between 0 and 1000
		for (int i = 0; i < arrayOneHundred.length; i++) {
			arrayOneHundred[i] = (int) (Math.random() * 1000);
			}
		
		//prompt user for a position in the array
		System.out.println("Please choose an array index position (0 to 99):");
				
		//new scanner for user input
		Scanner input = new Scanner(System.in);
		
		//set input to var userResponse
		int userResponse = input.nextInt();
		
		//try statement to output the value at the position the user has provided
		try {
		System.out.println("The value at that position is " + arrayOneHundred[userResponse] + ".");
		
		}
		
		//catch statement to output "Out of bounds" if the user response is not within the array
		catch(IndexOutOfBoundsException e){
			System.out.println("Out of bounds.");
		}
		
		
	}
}



