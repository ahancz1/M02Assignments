
import java.util.Scanner;


// creating custom exception
class BinaryFormatException extends Exception {
    // constructor of parent class Exception
    public BinaryFormatException(String exceptionMessage) {
        // calls the constructor
        super(exceptionMessage);
        
    }   
}

// main class to convert binary string to decimal 
public class BinaryConvert {
    // method for converting
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        try {
            // convert binary string to decimal
            return Integer.parseInt(binaryString, 2);
        } catch (NumberFormatException e) {
            // if input is invalid
            throw new BinaryFormatException(binaryString + " is not a binary number. Please enter either 1 or 0. ");
    }
}

// main method and input scanenr
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a binary number (only 1's and 0's are valid.): ");
    String userInput = scanner.nextLine();
    
    try {
        //convert user input into decimal
        int decimalValue = bin2Dec(userInput);
        System.out.println("The decimal equivalent: " + decimalValue);
    } catch (BinaryFormatException e) {
        System.out.println("Not a binary number.");
    } finally {
        scanner.close();
    }
}
}

