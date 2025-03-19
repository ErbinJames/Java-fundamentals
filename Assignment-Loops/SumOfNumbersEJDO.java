// Task 2: Sum of Natural Numbers
import java.util.Scanner;

public class SumOfNumbersEJDO {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        int i = 1;

        System.out.print("Enter a positive integer: "); //prompt the user for input
        n = scanner.nextInt();

        //validate input if it's positive or not
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return; //exit the program if it's not positive
        }

        //calculate the sum using a while loop
        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }

        // print the final sum after the while loops ends
        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);

        scanner.close();
    }
}
