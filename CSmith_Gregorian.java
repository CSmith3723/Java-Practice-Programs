package cop2800;

//import Gregorian Calendar tool
import java.util.GregorianCalendar;

//Main public class
public class CSmith_Gregorian {

	//main method
	public static void main(String[] args) {
		
		//new Gregorian calendar object
		GregorianCalendar calendar = new GregorianCalendar();
		
		//Displaying current Month, day of month, and year. Add 1 to the get month method to accurately display the month number according to the Gregorian calendar
		System.out.println("The current date according to the Gregorian calendar is: " + (calendar.get(GregorianCalendar.MONTH) + 1) + " " + calendar.get(GregorianCalendar.DAY_OF_MONTH) + " " + calendar.get(GregorianCalendar.YEAR));
		
		
		//Set time in milliseconds after Jan 1, 1970
		calendar.setTimeInMillis(1234567898765L);
		
		//Display time in milliseconds after Jan 1, 1970
		System.out.print("The time and date at 1234567898765 milliseconds after January 1, 1970 is: " + calendar.getTime());
	}

}
	