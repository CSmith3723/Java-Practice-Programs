import java.util.*;

public class Chris_Smith_12_3 {

	public static void main(String[] args) {
				
		int[] arrayOneHundred = new int[100];
				
		for (int i = 0; i < arrayOneHundred.length; i++) {
			arrayOneHundred[i] = (int) (Math.random() * 1000);
			}
				
//		for (int i = 0; i < arrayOneHundred.length; i++) {
//			System.out.print(arrayOneHundred[i] + " ");
//			}
				
		System.out.println("Please choose an array index position (0 to 99):");
				
		Scanner input = new Scanner(System.in);
		
		int userResponse = input.nextInt();
		
		if (userResponse > 99 || userResponse < 0)
			throw new IndexOutOfBoundsException("Out of bounds.");
		
		System.out.println("The value at that position is " + arrayOneHundred[userResponse] + ".");
		
		
		
		
		
	}
}



