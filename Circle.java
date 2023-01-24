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
 	