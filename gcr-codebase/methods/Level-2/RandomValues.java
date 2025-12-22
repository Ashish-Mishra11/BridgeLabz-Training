public class RandomValues {
  
  // Method section: Create the necessary methods
  // Method to generate array of 4-digit random numbers
  public static int[] generate4DigitRandomArray(int size) {
    int[] numbers = new int[size];
    for (int i = 0; i < size; i++) {
      // Generates random number between 1000 and 9999
      numbers[i] = (int)(Math.random() * 9000) + 1000;
    }
    return numbers;
  }
  // Method to find average, min, and max
  public static double[] findAverageMinMax(int[] numbers) {
    int min = numbers[0];
    int max = numbers[0];
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
      min = Math.min(min, numbers[i]);
      max = Math.max(max, numbers[i]);
    }
    double average = (double) sum / numbers.length;
    return new double[] { average, min, max };
  }

  public static void main(String[] args) {
    int[] randomNumbers = generate4DigitRandomArray(5);
    System.out.println("Generated 4-digit random numbers:");
    for (int i = 0; i < randomNumbers.length; i++) {
      System.out.println(randomNumbers[i]);
    }

    // Method call
    double[] result = findAverageMinMax(randomNumbers);
    
    // Display section: Display the result
    System.out.println("Average value: " + result[0]);
    System.out.println("Minimum value: " + result[1]);
    System.out.println("Maximum value: " + result[2]);
  }
}
