//Task 2: Modulus Operator
public class modulusOperatorEJDO {
    public static void main (String [] args) {
        //declare and initialize two integer variables and adding value
        int num1 = 25, num2 = 7; 
        //calculate the remainder using modulus operator
        int remainder = num1 % num2;
        
        //display the remainder
        System.out.println("The Remainder of " + num1 + " divided by " + num2 + " is: " + remainder);
        
        //checking divisibility
        if (remainder == 0) {
            System.out.println(num1 + " is divisible by " + num2);
        } else {
            System.out.println(num1 + " is not divisible by " + num2);
        }
    }
}
