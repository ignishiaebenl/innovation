import java.util.Scanner;

public class VowelCaseFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Fixing initialization of the scanner

        System.out.println("Enter a vowel (a, e, i, o, u): ");

        char vowel = scanner.next().charAt(0);  // Getting the input

        switch (Character.toLowerCase(vowel)) {  // Converting the vowel to lowercase for easy comparison

            case 'a':
                System.out.println("Lowercase vowel: a");
                System.out.println("Uppercase vowel: A");
                break;

            case 'e':
                System.out.println("Lowercase vowel: e");
                System.out.println("Uppercase vowel: E");
                break;

            case 'i':
                System.out.println("Lowercase vowel: i");
                System.out.println("Uppercase vowel: I");
                break;

            case 'o':
                System.out.println("Lowercase vowel: o");
                System.out.println("Uppercase vowel: O");
                break;

            case 'u':
                System.out.println("Lowercase vowel: u");
                System.out.println("Uppercase vowel: U");
                break;

            default:
                System.out.println("Invalid input. Please enter a vowel (a, e, i, o, u).");
                break;
        }

        scanner.close();  // Closing the scanner
    }
}
