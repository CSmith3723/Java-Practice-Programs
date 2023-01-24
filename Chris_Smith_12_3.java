package cop2800;

import java.util.*;

public class Chris_Smith_12_3 {

	public static void main(String[] args) {
				
		int[] arrayOneHundred = new int[100];
				
		for (int i = 0; i < arrayOneHundred.length; i++) {
			arrayOneHundred[i] = (int) (Math.random() * 1000);
			}
				
		System.out.println("Please choose an array index position (0 to 99):");
				
		Scanner input = new Scanner(System.in);
		
		int userResponse = input.nextInt();
		
		try {
		System.out.println("The value at that position is " + arrayOneHundred[userResponse] + ".");
		
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println("Out of bounds.");
		}
		
		
	}
}



