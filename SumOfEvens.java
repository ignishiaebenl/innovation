import java.util.Scanner;

public class SumOfEvens {
    
    public static int sumOfEvens(int n) {
        int total = 0;
        for (int i = 2; i <= n; i += 2) { // start at 2 and increment by 2
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: number up to which even numbers will be summed
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Output: Sum of all even numbers up to n
        System.out.println("Sum of all even numbers up to " + n + " is: " + sumOfEvens(n));
        
        scanner.close();
    }
}
