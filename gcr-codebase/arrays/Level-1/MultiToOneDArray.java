// Create MultiToOneDArray class to copy a 2D array into a 1D array and display

import java.util.Scanner;
public class MultiToOneDArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variables rows and columns to store the values given by user
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int columns = sc.nextInt();

    // Logic section: Create 2D array (matrix) and take input for each element
      // Logic section: Create 1D array and copy elements from 2D array
    int[][] matrix = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print("Enter element at [" + i + "][" + j + "]: ");
        matrix[i][j] = sc.nextInt();
      }
    }
    int[] array = new int[rows * columns];
    int index = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        array[index] = matrix[i][j];
        index++;
      }
    }

    // Display section: Print one Dimensional array  
    System.out.println("Elements of 1D array: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

    sc.close();
  }
}
