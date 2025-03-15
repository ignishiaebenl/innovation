import java.util.Scanner;

public class MatrixTranspose {

    // Method to find the transpose of the matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows]; // Swap rows and columns
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j]; // Transpose the matrix
            }
        }
        
        return transposed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Input the matrix elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Get the transposed matrix
        int[][] transposedMatrix = transposeMatrix(matrix);

        // Display the transposed matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
