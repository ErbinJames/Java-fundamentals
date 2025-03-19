//Task 4: Find the Largest Number
import java.util.Scanner;

public class LargestNumberFinderEJDO {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int largestNum = Integer.MIN_VALUE; //initialize with the smallest possible value
        boolean validNumber = false; // check if a valid number was entered

        // prompt the user for the first number
        System.out.print("Enter a number (-1 to stop): ");
        num = scanner.nextInt();

        // while loop until the user enters -1
        while (num != -1) {
            if (num >= largestNum) {
                largestNum = num; // update largestNum if the current number is greater
            } 
            validNumber = true; // marks that a valid number was entered


            //prompt again for input
            System.out.print("Enter a number (-1 to stop): ");
            num = scanner.nextInt();
        }

        //displaying the result
        if (validNumber) {
            System.out.println("The largest number entered is: " + largestNum);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close(); // close the scanner
    } 
}
