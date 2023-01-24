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
