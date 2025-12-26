import java.util.Scanner;

class RemoveElement {

  // Method to remove given element
  public static int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    System.out.print("Enter value to remove: ");
    int val = sc.nextInt();

    // Method call
    int k = removeElement(nums, val);

    //Display section: display the results
    System.out.println("Number of elements after removal: " + k);
    System.out.print("Array after removing element: ");
    for (int i = 0; i < k; i++) {
      System.out.print(nums[i] + " ");
    }

    sc.close();
  }
}
