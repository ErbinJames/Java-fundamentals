import java.util.Scanner;

public class StudentGradesAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = getNumberOfStudents(scanner);
        int[] grades = getGrades(scanner, numberOfStudents);

        int total = calculateTotal(grades);
        double average = calculateAverage(total, numberOfStudents);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);

        displayResults(total, average, highest, lowest);

        scanner.close();
    }

    // Method to get the number of students with validation
    public static int getNumberOfStudents(Scanner scanner) {
        int numberOfStudents;
        do {
            System.out.print("Enter the number of students: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number.");
                System.out.print("Enter the number of students: ");
                scanner.next();  // Discard invalid input
            }
            numberOfStudents = scanner.nextInt();

            if (numberOfStudents <= 0) {
                System.out.println("Number of students must be greater than zero.");
            }

        } while (numberOfStudents <= 0);

        return numberOfStudents;
    }

    // Method to get student grades with validation
    public static int[] getGrades(Scanner scanner, int numberOfStudents) {
        int[] grades = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            do {
                System.out.print("Enter grade for student " + (i + 1) + " : ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a valid grade (0-100).");
                    System.out.print("Enter grade for student " + (i + 1) + ": ");
                    scanner.next();
                }
                grades[i] = scanner.nextInt();

                if (grades[i] < 0 || grades[i] > 100) {
                    System.out.println("Grade must be between 0 and 100.");
                }
            } while (grades[i] < 0 || grades[i] > 100);
        }

        return grades;
    }

    // Method to calculate the total sum of grades
    public static int calculateTotal(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }

    // Method to calculate the average grade
    public static double calculateAverage(int total, int count) {
        return (double) total / count;
    }

    // Method to find the highest grade
    public static int findHighest(int[] grades) {
        int highest = Integer.MIN_VALUE;
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static int findLowest(int[] grades) {
        int lowest = Integer.MAX_VALUE;
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    // Method to display the results
    public static void displayResults(int total, double average, int highest, int lowest) {
        System.out.println("\n=== Grade Analysis ===");
        System.out.println("Total Grades: " + total);
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}
