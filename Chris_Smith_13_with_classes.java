//Import java utilities for Scanner
import java.util.*;

//Main public class, Chris Smith, Assignment 13
public class Chris_Smith_13_final {

	//Main method
	public static void main(String[] args) {
	
	//Prompt user for the length of the rectangle
	System.out.println("Please enter the length of the rectangle:");
	
	//New scanner
	Scanner input = new Scanner(System.in);
	
	//user input assigned to rectLen variable
	double rectLen = input.nextDouble();
	
	//prompt user for width of rectangle
	System.out.println("Please enter the width of the rectangle:");
	
	//user input assigned to rectWid var
	double rectWid = input.nextDouble();
	
	//prompt user to choose a color
	System.out.println("Please choose a color:");
	
	//user input assigned to rectColor var
	String rectColor = input.next();
	
	//prompt user to decide if rectangle is filled or not
	System.out.println("The rectangle is filled: true or false?");
	
	//user decision assigned to boolean rectFilled var
	boolean rectFilled = input.nextBoolean();
	
	//new Rectangle object 
	Rectangle userRectangle = new Rectangle(rectWid, rectLen, rectColor, rectFilled);
	
	
	//Circle
	
	//prompt user for radius of circle
	System.out.println("Please enter the radius of the circle:");
	
	//set radius to variable
	double radius = input.nextDouble();
	
	//prompt user for color
	System.out.println("Please choose a color:");
	
	//set color to variable
	String circColor = input.next();
	
	//ask user if circle is filled
	System.out.println("The circle is filled: true or false?");
	
	//set user response to boolean variable
	boolean circFilled = input.nextBoolean();
	
	//New circle object
	Circle userCircle = new Circle(radius, circColor, circFilled);
	
	
	//Triangle 
	//Prompt user for length of side 1
	System.out.println("Please enter the length side 1 of the triangle:");
	
	//set side 1 to variable
	double sideOne = input.nextDouble();
	
	//prompt user for length of side 2
	System.out.println("Please enter the length of side 2 of the triangle:");
	
	//set length of side 2 to variable
	double sideTwo = input.nextDouble();
	
	//prompt user for length of side 3
	System.out.println("Please enter the length of side 3 of the triangle:");
	
	//set length of side 3 to variable
	double sideThree = input.nextDouble();
	
	//prompt user for a color for the triangle
	System.out.println("Please choose a color:");
	
	//set color to variable
	String triColor = input.next();
	
	//ask user if the triangle is filled with that color
	System.out.println("The triangle is filled: true or false?");
	
	//set filled status to variable
	boolean triFilled = input.nextBoolean();
	
	//new Triangle object
	Triangle userTriangle = new Triangle(sideOne, sideTwo, sideThree, triColor, triFilled);
	
	//Displaying Rectangle, Circle, and Triangle information. Included empty lines for visual clarity. 
	System.out.println("The area of the rectangle is " + userRectangle.getArea() + ". The perimeter is " + userRectangle.getPerimeter() + " and it is " + userRectangle.isFilled() + " that the rectangle is filled with the color " + userRectangle.getColor() + ".");
	System.out.println();
	System.out.println("The area of the circle is " + userCircle.getArea() + ". The perimeter is " + userCircle.getPerimeter() + " and it is " + userCircle.isFilled() + " that the rectangle is filled with the color " + userCircle.getColor() + ".");
	System.out.println();
	System.out.println("The perimeter of the triangle is " + userTriangle.getPerimeter() + " and it is " + userTriangle.isFilled() + " that the rectangle is filled with the color " + userTriangle.getColor() + ".");
	System.out.println();
	
	//Create new instances of Geometric object. ***TBH I'M NOT SURE THIS IS WHAT YOU HAD IN MIND, BUT IT SEEMS TO WORK*** 
	GeometricObject rectangle = new Rectangle(rectWid, rectLen, rectColor, rectFilled);
	GeometricObject circle = new Circle(radius, circColor, circFilled);
	GeometricObject triangle = new Triangle(sideOne, sideTwo, sideThree, triColor, triFilled);

	//new objects for area of rectangle and circle
	double rectangleArea = rectangle.getArea();
	double circleArea = circle.getArea();
	
	//new objects for perimeters of rectangle, circle, and triangle
	double rectPeri = rectangle.getPerimeter();
	double circPeri = circle.getPerimeter();
	double triPeri = triangle.getPerimeter();
	
	//calling methods that check if areas are equal and compare the perimeters
	equals(circleArea, rectangleArea);
	periGreater(rectPeri, circPeri, triPeri);
	
	//Closing the scanner
	input.close();
	
	}
	
	

	
	//Method to compare areas of the circle and rectangle
	public static void equals(double circleArea, double rectangleArea) {
		
		//if statement for equal areas
		if (circleArea == rectangleArea)
			System.out.println("The areas of the rectangle and circle are equal.");
		
		//else statement for unequal areas. This will happen in almost all cases because of how the area of a circle is calculated.
		else System.out.println("The areas of the rectangle and circle are not equal.");
			
	}
	
	//method to compare the perimeters of the rectangle, circle, and triangle
	public static void periGreater(double rectPeri, double circPeri, double triPeri) {
		//if loop to compare the perimeters of the shapes
		
		//output if the rectangle has the largest perimeter
		if (rectPeri > circPeri && rectPeri > triPeri)
			System.out.println("The rectangle has the largest perimeter.");
		
		//output if the circle has the largest perimeter
		else if (circPeri > rectPeri && circPeri > triPeri)
			System.out.println("The circle has the largest perimeter.");
		
		//output if the triangle has the largest perimeter
		else if (triPeri > circPeri && triPeri > rectPeri)
			System.out.println("The triangle has the largest perimeter.");
		
		//output if the perimeters of the triangle and circle are equal
		else if (triPeri == circPeri)
			System.out.println("The perimeters of the triangle and circle are equal.");
		
		//output if the perimeters of the triangle and rectangle are equal
		else if (triPeri == rectPeri)
			System.out.println("The perimeters of the triangle and rectangle are equal.");
		
		//output if the rectangle and circle perimeters are equal. Should be the only remaining case.
		else System.out.println("The perimeters of the rectangle and circle are equal.");
	}
	
}


class Rectangle extends GeometricObject {
	
	//The default width and height of the rectangle are 1
	double width = 1;
	double height = 1; 
	
	//Construct a rectangle object
	Rectangle(){
	}
	
	//Construct a rectangle object
	public Rectangle(double width, double height, String color, boolean filled){
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	//Return the area of the rectangle
	public double getArea() {
		return width * height;
	}
	
	 //Return the perimeter of the rectangle
	public double getPerimeter() {
		return (2 * width) + (2 * height);
	}
	
	
}

public class Circle extends GeometricObject {
	
	private double radius;
	

 	public Circle() {
 	}
	
 	public Circle(double radius) {
 		this.radius = radius;
 	}
	
 	public Circle(double radius, String color, boolean filled) {
	this.radius = radius;
	setColor(color);
	setFilled(filled);
	}
	 
 	public double getRadius() {
 		return radius;
 	}
 	
 	public void setRadius(double radius) {
 		this.radius = radius;
 	}
 	
 	public double getArea() {
 		return radius * radius * Math.PI;
 	}
 	
 	/** Return diameter */
 	public double getDiameter() {
 		return 2 * radius;
 	}
 	
 	/** Return perimeter */
 	public double getPerimeter() {
 		return 2 * radius * Math.PI;
 	}
 	
 	public boolean equals(Circle circle) {
 		return this.radius == circle.radius;
 		}
 	
 	/** Print the circle info */
 	public void printCircle() {
 	System.out.println("The circle is " + getColor() + " and the radius is " + radius);
 	}
	
 	
 	}
 	

class Triangle extends GeometricObject{
	
	//Declaring side variables with default values of 1.0
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	//No arg constructor for default triangle
	Triangle(){
	}
	
	//Constructor creating triangle with the 3 sides.
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//Triangle method using sides, filled, and color as arguments. Uses GeometricObject methods to set variables for Triangle class.  
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}
	
	//Accessor methods for the 3 sides
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	//Get method for perimeter of the triangle
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	//Carry over from GEOBJ
	public double getArea() {
		return 0;
	}
	
	//public toString method 
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
	
}


 	