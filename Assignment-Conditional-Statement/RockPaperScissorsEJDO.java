// Task 4: Rock, Paper, Scissors 
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsEJDO {
    public static void main (String[] args) {
        // Create Scanner object for user input and Random object for computer's choice
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String userChoice;    // Stores the user's choice (R, P, or S)
        String computerChoice; // Stores the computer's choice (R, P, or S)

        // Generate a random number (1 to 3) to determine the computer's choice
        int randomNumber = random.nextInt(3) + 1;

        // Prompt user to enter their choice
        System.out.print("Enter your choice (R, P, S): ");
        userChoice = scanner.next().toUpperCase(); // Convert input to uppercase for consistency

        // Assign computer's choice based on the generated random number
        if (randomNumber == 1) {
            computerChoice = "R"; // Rock
        } else if (randomNumber == 2){
            computerChoice = "P"; // Paper
        } else {
            computerChoice = "S"; // Scissors
        }

        // Display computer's choice
        System.out.println("Computer Chose: " + computerChoice);

        // Determine the winner using a switch statement
        switch(userChoice) {
            case "R": // User chooses Rock
                if (computerChoice.equals("R")) {
                    System.out.println("It's a tie!");
                } else if (computerChoice.equals("P")) {
                    System.out.println("You lose! Paper covers Rock.");
                } else {
                    System.out.println("You win! Rock crushes Scissors.");
                }
                break;

            case "P": // User chooses Paper
                if (computerChoice.equals("P")) {
                    System.out.println("It's a tie!");
                } else if (computerChoice.equals("S")) {
                    System.out.println("You lose!");
                } else {
                    System.out.println("You win! Paper covers Rock.");
                }
                break;

            case "S": // User chooses Scissors
                if (computerChoice.equals("S")) {
                    System.out.println("It's a tie!");
                } else if (computerChoice.equals("R")) {
                    System.out.println("You lose! Rock crushes Scissors.");
                } else {
                    System.out.println("You win! Scissors cut Paper.");
                }
                break;

            default: // Handles invalid input
                System.out.println("Invalid input! Please enter R, P, or S.");
        }

        // Close the scanner 
        scanner.close();
    }
}
