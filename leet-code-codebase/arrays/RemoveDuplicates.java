import java.util.Scanner;
import java.util.Arrays;

class RemoveDuplicates {

  // Method to remove duplicates from sorted array
  public static int removeDuplicates(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return (i + 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter sorted array elements:");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    // Method call
    int k = removeDuplicates(nums);

    // Display section: Display results
    System.out.println("Number of unique elements: " + k);
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < k; i++) {
      System.out.print(nums[i] + " ");
    }

    sc.close();
  }
}
