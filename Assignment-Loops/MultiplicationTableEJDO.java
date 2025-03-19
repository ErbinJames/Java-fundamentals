//Task 1: Multiplication Table
public class MultiplicationTableEJDO {
    public static void main (String[] args) {
        //declare num variable with the initial value of 5
        int num = 5;

        // loops from 1 to 10 to generate the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i)); // print the result in format: num x i = result
        }
    }
}
