//Task 3: Password Checker
import java.util.Scanner;

public class PasswordCheckerEJDO {
    public static void main (String[] args) {
        //create scanner object for input
        Scanner scanner = new Scanner(System.in); 
        String correctKey = "java123"; //declare the correct password
        String userKey; // declare variable userkey to store user input

        //loop until the correct password is entered
        do {
            System.out.print("Enter password: ");
            userKey = scanner.nextLine(); // read user input

            if (!userKey.equals(correctKey)) { // check if the entered password is incorrect
                System.out.println("Incorrect password.Try again");
            }

        } while (!userKey.equals(correctKey)); // repeat if incorrect

        //after the correct password was entered, it will display the message
        System.out.println("Access granted");

        scanner.close(); // close the scanner 
    }
}
