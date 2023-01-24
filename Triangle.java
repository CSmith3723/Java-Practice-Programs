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