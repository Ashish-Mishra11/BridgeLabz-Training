import java.util.Random;
import java.util.Scanner;

public class MatrixOperationsUsingMethods {

  // Method section: create the necessary methods
  // Method to create a random matrix
  public static int[][] createRandomMatrix(int rows, int cols) {
    Random rd = new Random();
    int[][] matrix = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = rd.nextInt(10); // Random numbers from 0 to 9
      }
    }
    return matrix;
  }
  // Method to add two matrices
  public static int[][] addMatrices(int[][] A, int[][] B) {
    int rows = A.length;
    int cols = A[0].length;
    int[][] result = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        result[i][j] = A[i][j] + B[i][j];
      }
    }
    return result;
  }
  // Method to subtract two matrices
  public static int[][] subtractMatrices(int[][] A, int[][] B) {
    int rows = A.length;
    int cols = A[0].length;
    int[][] result = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        result[i][j] = A[i][j] - B[i][j];
      }
    }
    return result;
  }
  // Method to multiply two matrices
  public static int[][] multiplyMatrices(int[][] A, int[][] B) {
    int rowsA = A.length;
    int colsA = A[0].length;
    int colsB = B[0].length;
    int[][] result = new int[rowsA][colsB];
    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsB; j++) {
        result[i][j] = 0;
        for (int k = 0; k < colsA; k++) {
          result[i][j] += A[i][k] * B[k][j];
        }
      }
    }
    return result;
  }
  // Method to print a matrix
  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.print(val + "\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take user inputs
    System.out.println("Enter the rows: ");
    int rows = sc.nextInt();
    System.out.println("Enter the columns: ");
    int cols = sc.nextInt();

    int[][] matrixA = createRandomMatrix(rows, cols);
    int[][] matrixB = createRandomMatrix(rows, cols);

    // Display section: Display the results
    System.out.println("Matrix A:");
    printMatrix(matrixA);

    System.out.println("\nMatrix B:");
    printMatrix(matrixB);

    System.out.println("\nA + B:");
    printMatrix(addMatrices(matrixA, matrixB));

    System.out.println("\nA - B:");
    printMatrix(subtractMatrices(matrixA, matrixB));

    System.out.println("\nA x B:");
    printMatrix(multiplyMatrices(matrixA, matrixB));

    sc.close();
  }
}
