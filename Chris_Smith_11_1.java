
import java.util.*;

//Public class
public class Chris_Smith_11_1 {

	//Main method
	public static void main(String[] args) {
		
	//Prompt user for side 1 of the triangle
	System.out.println("Please enter the length of side 1 of the triangle:");
	
	//New scanner for user input
	Scanner input = new Scanner(System.in);
	
	//Set input to variable side1
	double side1 = input.nextDouble();
	
	//Promnpt user for side 2
	System.out.println("Please enter the length of side 2 of the triangle:");
	
	//Set input to variable side2
	double side2 = input.nextDouble();
	
	//Prompt user for side 3
	System.out.println("Please enter the length of side 3 of the triangle:");
	
	//Set input to variable side3
	double side3 = input.nextDouble();
	
	//Prompt user for a color
	System.out.println("Please choose a color:");
	
	//Set input to variable color
	String color = input.next();
	
	//Ask user if the triangle is filled using boolean response
	System.out.println("The triangle is filled: true or false?");
	
	//Set boolean response to variable filled
	boolean filled = input.nextBoolean();
	
	//Create new triangle object from Triangle class
	Triangle userTriangle = new Triangle(side1, side2, side3, filled, color);
	
	//Output perimeter, color, filled status, and side lengths of the triangle.
	System.out.println("The perimeter of the triangle is " + userTriangle.getPerimeter() + ".");
	
	System.out.println("The color you chose is " + userTriangle.getColor() + ".");
	
	System.out.println("The triangle is filled: " + userTriangle.isFilled() + ".");
	
	System.out.println("These are the side lengths of the " + userTriangle.toString() + ".");
	
	//Close scanner
	input.close();
	}

}


//Creating Triangle class that extends GeometricObject class
//class Triangle extends GeometricObject{
//	
//	//Declaring side variables with default values of 1.0
//	double side1 = 1.0;
//	double side2 = 1.0;
//	double side3 = 1.0;
//	
//	//No arg constructor for default triangle
//	Triangle(){
//	}
//	
//	//Constructor creating triangle with the 3 sides.
//	public Triangle(double side1, double side2, double side3) {
//		this.side1 = side1;
//		this.side2 = side2;
//		this.side3 = side3;
//	}
//	
//	//Triangle method using sides, filled, and color as arguments. Uses GeometricObject methods to set variables for Triangle class.  
//	public Triangle(double side1, double side2, double side3, boolean filled, String color) {
//		this.side1 = side1;
//		this.side2 = side2;
//		this.side3 = side3;
//		setColor(color);
//		setFilled(filled);
//	}
//	
//	//Accessor methods for the 3 sides
//	public double getSide1() {
//		return side1;
//	}
//	public double getSide2() {
//		return side2;
//	}
//	public double getSide3() {
//		return side3;
//	}
//	
//	//Get method for perimeter of the triangle
//	public double getPerimeter() {
//		return side1 + side2 + side3;
//	}
//	
//	//*****Eclipse required me to carry this over, but I'm not sure why.***** I could return 0, but that seems like the wrong option. 
//	public double getArea() {
//		return (base * height)/2;
//	}
//	
//	//public toString method 
//	public String toString() {
//		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
//	}
//	
//	
//}