//Task 2: Grading System
import java.util.Scanner;

public class GradingSystemEJDO {
    public static void main(String[] args){
        //create a scanner object
        Scanner scanner = new Scanner(System.in);
        
        //variable to store the student score
        int score;
        //prompt the user to enter their score
        System.out.print("Enter your score :");
        score = scanner.nextInt();

        //determine the grade and provide feedback
        if (score >= 90) {
            System.out.println("Grade: A");
            System.out.println("Feedback: Excellent!");
        } else if (score >= 75){
            System.out.println("Grade: B");
            System.out.println("Feedback: Good job!");
        } else if (score >= 50) {
            System.out.println("Grade: C");
            System.out.println("Feedback: Keep improving!");
        } else {
            System.out.println("Grade: F");
            System.out.println("Failed, better luck next time!");
        }

        //close the scanner
        scanner.close();
    }
}
