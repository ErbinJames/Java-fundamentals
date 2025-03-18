//Task 3: Electricity Bill Calculator
import java.util.Scanner;

public class ElectricityBillEJDO {
    public static void main (String[] args) {
        //create a scanner object
        Scanner scanner = new Scanner(System.in);

        int units; //variable units to store the number of units consumed
        double totalBill = 0; //variable totalBill to store the total bill amount, initial value is set to 0

        // prompt the user to enter the number of units consumed
        System.out.print("Enter number of units consumed: ");
        units = scanner.nextInt();

        //calculate the total bill based on the number of units consumed
        if (units <= 100) {
            totalBill = units * 1.50;
        } else if (units <= 300) {
            totalBill = (100 * 1.50) + ((units -100) * 2.50);
        } else {
            totalBill = (100 * 1.50) + (200 * 2.50) + ((units - 300) * 3.50);
        }
        //display the total bill amount
        System.out.println("Total bill: " + totalBill);

        //close the scanner
        scanner.close();
    }
}
