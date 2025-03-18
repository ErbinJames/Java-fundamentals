//Task 2: Assignment Operators
public class assignmentOperatorsEJDO {
    public static void main(String[] args) {
        //first: Assignment operators
        performedAssignmentOperations();
        //second: call method for final price calculation
        calculateFinalPrice();
    }

    //method for performing assignment operations
    public static void performedAssignmentOperations() {
        int x = 10; 
        System.out.println("Initial value of x: " + x);

        x += 5;
        System.out.println("After x += 5: " + x);
        x -= 3;
        System.out.println("After x -= 3: " + x);
        x *= 2;
        System.out.println("After x *= 2: " + x);
        x /= 4;
        System.out.println("After x /= 4: " + x);
        x %= 3;
        System.out.println("After x %= 3: " + x);
    }

    //method for final price calculation
    public static void calculateFinalPrice() {
        double initialPrice = 100.0; // it will start at 100 
        System.out.println("\nInitial Price: $" + initialPrice);

        initialPrice *= 0.80; // 20% discount
        System.out.println("After 20% discount: $" + initialPrice);

        initialPrice *= 1.10; // apply 10% tax
        System.out.println("After 10% tax: $" + initialPrice);

        System.out.println("Final price after discount and tax: $" + initialPrice);

    }
    
}
