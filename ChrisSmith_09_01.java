//Not sure why the Eclipse on my laptop suddenly requires this. Never had this issue on my desktop. Must have done something different with my configuration. 
package cop2800;


//Create the public class containing the main method and rectangle class
public class ChrisSmith_09_01 {

	//Main method
	public static void main(String[] args) {

		//Create a rectangle with a width of 4 and a height of 40.
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The first circle has a width of " + rectangle1.width + " and a height of " + rectangle1.height + " . Its perimeter is " + rectangle1.getPerimeter() + " and its area is " + rectangle1.getArea());
		System.out.println();
		
		//Create a rectangle with a width of 3.5 and a height of 35.9.
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.printf("The second circle has a width of " + rectangle2.width + " and a height of " + rectangle2.height + " . Its perimeter is " + rectangle2.getPerimeter() + " and its area is %.2f", rectangle2.getArea());
		
		
	//Create the Rectangle class. This rectangle class had to be saved as a separate file? The IDE did not do this automatically. 		
	


	}

}

class Rectangle {
	
	//The default width and height of the rectangle are 1
	double width = 1;
	double height = 1; 
	
	//Construct a rectangle object
	Rectangle(){
	}
	
	//Construct a rectangle object
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	//Return the area of the rectangle
	double getArea() {
		return width * height;
	}
	
	//Return the perimeter of the rectangle
	double getPerimeter() {
		return (2 * width) + (2 * height);
	}
	
	//Set a new width and height for this rectangle. I assume this is to empty the values? 
	void setDimensions(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	
	
	
}