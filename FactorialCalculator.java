import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long factorial = 1;

            // Calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
