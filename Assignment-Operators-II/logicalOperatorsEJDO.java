//Task 1: Logical Operators
public class logicalOperatorsEJDO {
    public static void main (String[] args) {
        boolean a = true, b = false; //declare boolean and initialize it

        // performing logical operations and print the results
        System.out.println("a && b: " + (a && b)); 
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a)); 
        System.out.println("!b: " + (!b));  

        int creditScore, annualIncome;
        creditScore = 750; // above 700
        annualIncome = 60000; // above 50,000

        // checking loan eligibility 
        if (creditScore > 700 && annualIncome > 50000) {
            System.out.println("You are Eligible for loan");
        } else {
            System.out.println("You're not Eligible for loan");
        }    
    }
}
