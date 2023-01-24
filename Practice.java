import java.util.*;

public class Practice {

    //property
    final static private Scanner ScannerObj = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Please enter an input: ");
        
        //common datatypes
        String stringInput = GetStringInput(2);

        //odd datatype, ternary
        boolean r = (StringInput == "") ? false : true;

        //numerical datatypes
        int wholeNumber = AddNumbers(stringInput) ;
        /*float
        double
        long
        short*/

        System.out.println("Hello," +GetName("Fiskey", "Francis") + "!");
    }

    private static String GetName(String lastName, String firstName){
        return lastName + ", " + firstName;
    }

    private static String[] GetStringInput(int total){
        String[] output = new String[total];

        for (int i = 0; i < total; i++){
            if (i > 0) { 
                System.out.println("Please enter another number: "); 
            }

            output[i] = new ScannerObj.nextLine();
        }
        return ScannerObj.nextLine();
    }

    private static int AddNumbers(String[] input){
        int output = 0;
        
        for (String num : input) {
            output = output + Integer.parseInt(num);
        } 
        return output;

        
    }
     
}
