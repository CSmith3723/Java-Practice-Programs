import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList; //Import ArrayList
import java.util.Iterator; //Import Iterator to compare elements in List
import java.util.List; //Import List
import java.util.Scanner; // Import the Scanner class to read text files

public class DataSorted { //Public class DataSorted
	
  public static void main(String[] args) { //main method
	  
    try { //try block
    
    	
      File myObj = new File("SortedStrings.txt"); //File object
      Scanner myReader = new Scanner(myObj); //new scanner myReader
      
      List<String> sortedStrings = new ArrayList<String>(); //create ArrayList to hold strings from text file
      
      while (myReader.hasNextLine()) { //while block to read strings from file
        String data = myReader.nextLine(); //store strings in data variable
        sortedStrings.add(data); //add strings to ArrayList

      }
      
      isSorted(sortedStrings); //call isSorted method to check sortedStrings ArrayList
      myReader.close(); //close reader
      
    } 
    
    catch (FileNotFoundException e) { //catch block if file is not found
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
    
  }
  
  public static boolean isSorted(List<String> sortedStrings) { //isSorted boolean method 
	    

	    Iterator<String> iter = sortedStrings.iterator(); //run iterator on sortedStrings ArrayList
	    String current, previous = iter.next();
	    
	    while (iter.hasNext()) { //while loop to compare previous and current elements in ArrayList
	        current = iter.next();
	        if (previous.compareTo(current) > 0) {
	            System.out.println("The file is not sorted."); //if previous element is greater than current element, output that file is not sorted
	        	return false;
	        }
	        previous = current;
	        
	    }
	    System.out.println("The file is sorted."); //if elements are equal or previous is less than current, out put that file is sorted
	    return true;
	}
  
}

