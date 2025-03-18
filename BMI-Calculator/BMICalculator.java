import java.util.Scanner;

public class BMICalculator {
    public static void main (String[] args) {
        //Creating Scanner Object
        Scanner scanner = new Scanner(System.in);
        
        //Declaring variables
        double weight, height, bmi;
        String healthStatus;

        // accepting user input
        System.out.print("Enter your weight (kg): ");
        weight = scanner.nextDouble(); // read weight as double

        System.out.print("Enter your height (m): ");
        height = scanner.nextDouble(); // height as double

        //formula to calculate BMI
        bmi = weight / (height * height);

        //determine health status using ternary operator
        healthStatus = (bmi < 18.5) ? "Underweight" :
        (bmi >= 18.5 && bmi < 24.9) ? "Normal" :
        (bmi >= 25 && bmi < 29.9) ? "Overweight": "Obese";

        //display BMI Result
        System.out.println("\n=== BMI Report ===");
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("Health Status: " + healthStatus);

        scanner.close(); //Close scanner
    }
}