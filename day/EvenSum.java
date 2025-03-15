import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the value of n
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        // Variable to store the sum of even numbers
        int sum = 0;

        // Loop through all numbers from 1 to n
        for (int i = 2; i <= n; i += 2) {
            sum += i;  // Add even number to the sum
        }

        // Print the result
        System.out.println("The sum of all even numbers up to " + n + " is: " + sum);
    }
}
