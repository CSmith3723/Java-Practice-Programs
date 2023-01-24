
//import Java utilities
import java.util.*;

//Create public class. Chris Smith, Assignment 7.1
public class ChrisSmith_7_1 {

	//main method
	public static void main(String[] args) {

		
		//Prompt user for the number of graded exams
	System.out.println("Please enter the number of graded student exams:");
	
		//New Scanner
	Scanner input = new Scanner(System.in);
		
		//Accept number of student exams
	int numberStudents = input.nextInt();
	
		//Create an array to hold student exam grades
	int[] studentGrades = new int[numberStudents]; 
	  
		//Prompt user to provide exam grades
	System.out.println("Please enter the exam grades: ");  
	
		//For loop to populate the array of grades
	for(int i = 0; i< numberStudents; i++)  
	   
		//Accepts grade inputs from the user 
		studentGrades[i]=input.nextInt();
		
		//Sorts the student grades in ascending order 
	Arrays.sort(studentGrades);
	System.out.print(Arrays.toString(studentGrades));
		//Finds max
	int best = studentGrades[studentGrades.length - 1];
	
	System.out.print("The best grade is " + best + ".");
	
	//Issues past here. 
	
	for(int i = 0; i < studentGrades.length; i++);
		
		String GRADE = "The student's grade is ";
		
		if(studentGrades[i] >= best -10)
			System.out.print(GRADE + studentGrades[i] + " which is an A.");
		else if (studentGrades[i] >= best - 20)
			System.out.print(GRADE + studentGrades[i] + " which is a B.");
		else if (studentGrades[i] >= best - 30)
			System.out.print(GRADE + studentGrades[i] + " which is a C.");
		else if (studentGrades[i] >= best - 40)
			System.out.print(GRADE + studentGrades[i] + " which is a D.");
		else
			System.out.print(GRADE + studentGrades[i] + "which is an F.");
	
		
	}
}
