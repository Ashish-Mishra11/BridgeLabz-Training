import java.util.Random;

public class MatrixOperationsUsingMethodsV2 {

  // Method section: create necessary methods
  // Method to create a random matrix
  public static double[][] createRandomMatrix(int rows, int cols) {
    Random rand = new Random();
    double[][] matrix = new double[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = rand.nextInt(10); // Random numbers between 0-9
      }
    }
    return matrix;
  }
  // Method to display a matrix
  public static void displayMatrix(double[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
  }
  // Method to find the transpose of a matrix
  public static double[][] transpose(double[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    double[][] transposed = new double[cols][rows];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        transposed[j][i] = matrix[i][j];
      }
    }
    return transposed;
  }
  // Method to find determinant of 2x2 matrix
  public static double determinant2x2(double[][] matrix) {
    return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
  }
  // Method to find determinant of 3x3 matrix
  public static double determinant3x3(double[][] m) {
    return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
         - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
         + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
  }
  // Method to find inverse of 2x2 matrix
  public static double[][] inverse2x2(double[][] m) {
    double det = determinant2x2(m);
    if (det == 0) {
      System.out.println("Inverse not possible, determinant is 0.");
      return null;
    }
    double[][] inv = {
      { m[1][1]/det, -m[0][1]/det },
      { -m[1][0]/det, m[0][0]/det }
    };
    return inv;
  }
  // Method to find inverse of 3x3 matrix
  public static double[][] inverse3x3(double[][] m) {
    double det = determinant3x3(m);
    if (det == 0) {
      System.out.println("Inverse not possible, determinant is 0.");
      return null;
    }

    double[][] inv = new double[3][3];

    inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1])/det;
    inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2])/det;
    inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1])/det;

    inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2])/det;
    inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0])/det;
    inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2])/det;

    inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0])/det;
    inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1])/det;
    inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0])/det;

    return inv;
  }

  public static void main(String[] args) {

    // Input and declaration section
    // Create random 2x2 and 3x3 matrices
    double[][] matrix2x2 = createRandomMatrix(2,2);
    double[][] matrix3x3 = createRandomMatrix(3,3);

    // Display section: Display the results
    System.out.println("2x2 Matrix:");
    displayMatrix(matrix2x2);
    System.out.println("Transpose:");
    displayMatrix(transpose(matrix2x2));
    System.out.println("Determinant: " + determinant2x2(matrix2x2));
    System.out.println("Inverse:");
    displayMatrix(inverse2x2(matrix2x2));

    System.out.println("3x3 Matrix:");
    displayMatrix(matrix3x3);
    System.out.println("Transpose:");
    displayMatrix(transpose(matrix3x3));
    System.out.println("Determinant: " + determinant3x3(matrix3x3));
    System.out.println("Inverse:");
    displayMatrix(inverse3x3(matrix3x3));
  }
}
