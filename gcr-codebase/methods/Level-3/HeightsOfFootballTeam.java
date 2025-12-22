public class HeightsOfFootballTeam {

  // Method section: Create necessary methods
  // Method to generate random heights between 150 and 250
  public static int[] generateHeights(int size) {
    int[] heights = new int[size];
    for (int i = 0; i < size; i++) {
      heights[i] = (int)(Math.random() * 101) + 150;
    }
    return heights;
  }
  // Method to find sum of heights
  public static int findSum(int[] heights) {
    int sum = 0;
    for (int i = 0; i < heights.length; i++) {
      sum += heights[i];
    }
    return sum;
  }
  // Method to find mean height
  public static double findMean(int[] heights) {
    int sum = findSum(heights);
    return (double) sum / heights.length;
  }
  // Method to find shortest height
  public static int findShortest(int[] heights) {
    int shortest = heights[0];
    for (int i = 1; i < heights.length; i++) {
      if (heights[i] < shortest) {
        shortest = heights[i];
      }
    }
    return shortest;
  }
  // Method to find tallest height
  public static int findTallest(int[] heights) {
    int tallest = heights[0];
    for (int i = 1; i < heights.length; i++) {
      if (heights[i] > tallest) {
        tallest = heights[i];
      }
    }
    return tallest;
  }

  public static void main(String[] args) {

    // Input section: generate random values using Math.random()
    int[] heights = generateHeights(11);

    System.out.println("Heights of football players: ");
    for (int i = 0; i < heights.length; i++) {
      System.out.println(heights[i]);
    }

    // Display section: Display results of players heights
    System.out.println("Shortest height: " + findShortest(heights) + " cm");
    System.out.println("Tallest height: " + findTallest(heights) + " cm");
    System.out.println("Mean height: " + findMean(heights) + " cm");
  }
}
