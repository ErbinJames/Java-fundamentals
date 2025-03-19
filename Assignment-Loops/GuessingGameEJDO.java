//Task 5: Number Guessing Game
import java.util.Random;
import java.util.Scanner;

public class GuessingGameEJDO {
    public static void main (String[] args) {
        // create scanner for user input
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //generate a random number between 1 and 50 
        int secretNumber = random.nextInt(50) + 1;
        int attempts = 0; //initialize to 0 
        int userGuess = -1; // initialize to avoid undefined behavior

        //loop until the user guesses the correct number
        while (userGuess != secretNumber) {
            System.out.print("Print a number between 1 and 50: "); //prompt for user input
            userGuess = scanner.nextInt(); //read user input
            attempts++; // increment attempt count

            //provide feedback message on the guess
            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } 
        }

        //display success message with the number of attempts
        System.out.println("Correct! You guessed it in " + attempts + " attempts.");

        scanner.close(); //close the scanner
    }
}
