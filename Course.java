
import java.util.*;

public class Course {
	
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the name of the course:");
	
	String courseName = input.next();
	
	Course courseInfo = new Course(courseName);
	
	System.out.println("The name of the course is: " + courseInfo.getCourseName());
	System.out.println();
	
	
	for (int i = 0; i <= courseInfo.getNumberOfStudents(); i++) {
	
		System.out.println("Please enter a student name. To exit, type 'x': ");
		String studentName = input.next();
		
		if("x".equals(studentName)) {
			break;}
		
		courseInfo.addStudent(studentName);
		}	
	
	System.out.println(Arrays.toString(courseInfo.getStudents()));
	
//	for (int i = 0; i < courseInfo.getNumberOfStudents(); i++){
//		
//		courseInfo.clear();
//	}
//	
//	
	
	System.out.println("Please choose the number of the student to remove from the list: ");
	
	int removedStudent = input.nextInt();
	
	courseInfo.dropStudent(removedStudent);

		
	System.out.println(Arrays.toString(courseInfo.getStudents()));	
	
	
	
	
	
	
	System.out.println("Here is an empty array using the clear function: ");
	courseInfo.clear();
	
	System.out.println(Arrays.toString(courseInfo.getStudents()));
		
		
	}
	

	

	
	private String courseName;
	private String[] students = new String[3];
	private int numberOfStudents;
	


 	public Course(String courseName) {
 		this.courseName = courseName;
 		}
 	
 	public void addStudent(String student) {
 		
 		if (numberOfStudents >= students.length) {
 			String[] temp = new String[students.length + 1];
 			System.arraycopy(students, 0, temp, 0, students.length);
 			students = temp;
 		}
 		students[numberOfStudents] = student;
 		numberOfStudents++;
 		
 		}

 	public String[] getStudents() {
 		return students;
 		}

 	public int getNumberOfStudents() {
 		return numberOfStudents;
 		}
 
 	public String getCourseName() {
 		return courseName;
 		}

 	public void dropStudent(int removedStudent) {
 		
 		int index = removedStudent -1; 
 		
 		if (numberOfStudents <= students.length) {
 			
 			String[] temp = new String[students.length - 1];
 			System.arraycopy(students, 0, temp, 0, index);
 			System.arraycopy(students, index + 1, temp, index, students.length - index - 1);
 			students = temp;
 			
 			}
 		}
 		
 	
 	
 	public void clear() {
 		
 		while(students.length != 0) {
 			String[] temp = new String[students.length - 1];
 			System.arraycopy(students, 0, temp, 0, students.length - 1);
 			students = temp;
 			
 		}
 		
 	}
 		
 }
 			
 

