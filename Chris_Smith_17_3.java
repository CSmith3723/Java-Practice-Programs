//Chris Smith, 17.3

//Importing the necessary java.io utilities
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Public class
public class Chris_Smith_17_3 {

	//main method
	public static void main(String[] args) {

		//try statement for new data stream and file stream
		try (DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_02.dat"));
				) {
		
		//set variable to hold sum of integers in binary file
		int total = 0;
	
		//while loop to read and add integers to total while binary data remains in file.
		while (input.available() > 0) 
			total += input.readInt();
			
			//Print out the sum of the integers in the binary file.
		System.out.println("The sum of the numbers in this file is " + total + ".");
		
		}
	

		//Catch statement for if file is not found
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Catch statement for if there is an In/Out exception.
		catch (IOException ex) {
			ex.printStackTrace();
		}
	
	}

}
