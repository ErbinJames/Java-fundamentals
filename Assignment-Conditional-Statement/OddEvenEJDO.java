//Task 1: Odd or Even Checker
import java.util.Scanner;

public class OddEvenEJDO {
    public static void main(String[] args){
        //create a scanner object 
        Scanner scanner = new Scanner(System.in);

        //declaring variable to store user input
        int number;

        // prompt the user to enter a number
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        //check if the number is even or odd
        if (number %2 == 0) {
            System.out.println(number + " is an even number."); //even
        } else {
            System.out.println(number + " is an odd number.");//odd
        }

        scanner.close(); //close the scanner to erase or free resources
    }
}
