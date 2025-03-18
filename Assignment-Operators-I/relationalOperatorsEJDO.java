//Task 3: Relational Operators
public class relationalOperatorsEJDO {
    public static void main(String[] args) {
        int x = 10, y = 25; // declaring x and y variable and assign values

        // perform relational comparison and then print results (true or false)
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        // bonus task: check if x is within a specific range (10 to 50)
        int lowerBound = 10;
        int upperBound = 50;

        // determine if the value of X falls within the specific range or not and then print the message 
        if (x >= lowerBound && x <= upperBound) {
            System.out.println("x is within the range " + lowerBound + " to " + upperBound);
        } else {
            System.out.println("x is outside the range " + lowerBound + " to " + upperBound);
        }
    }
}
