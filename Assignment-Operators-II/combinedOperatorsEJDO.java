//Task 3: Combined Logical and Assignment operators
public class combinedOperatorsEJDO {
    public static void main (String[] args) {
        int a = 5;
        int b = 10;

        // check if both are positive
        if (a > 0 && b > 0) {
            a += b; // add a and b then store the result in a.
            b *= 2; // multiply a by 2 then store the result in b.

            System.out.println("Final value of a: " + a);
            System.out.println("Final value of b: " + b);
        } 
    }
}
