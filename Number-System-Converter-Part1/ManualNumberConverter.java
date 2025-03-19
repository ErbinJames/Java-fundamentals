import java.util.Scanner;

public class ManualNumberConverter {

    public static void main (String[] args) {
        //create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //user input to enter a decimal number(base 10)
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        //Convert to different number systems (method approach)
        String binary = toBinary(decimalNumber);
        String octal = toOctal(decimalNumber);
        String hexadecimal = toHexadecimal(decimalNumber);

        //display the results
        System.out.println("\n=== Number System Conversions ===");
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        //close the scanner
        scanner.close();
    }

    //Method to convert decimal to binary
    public static String toBinary(int decimalNumber) {
        String binaryResult = "";

        if (decimalNumber == 0) {
            return "0";
        }

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryResult = remainder + binaryResult; 
            decimalNumber /= 2; //base 2
        }

        return binaryResult;
    }

    //Method to convert decimal to Octal
    public static String toOctal(int decimalNumber) {
        String octalResult = "";

        if (decimalNumber == 0) {
            return "0";
        }

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8;
            octalResult = remainder + octalResult; 
            decimalNumber /= 8; //base 8
        }

        return octalResult;
    }

    //Method to convert decimal to Hexadecimal
    public static String toHexadecimal(int decimalNumber) {
        String hexResult = "";
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        if (decimalNumber == 0) {
            return "0";
        }

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            hexResult = hexDigits[remainder] + hexResult; // string concatenation 
            decimalNumber /= 16; //base 16
        }

        return hexResult;
    }
}
