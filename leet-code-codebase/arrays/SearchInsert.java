import java.util.Scanner;

class SearchInsert {

  // Method to find search insert position
  public static int searchInsert(int[] nums, int target) {
    int ini = 0;
    int last = nums.length - 1;

    while (ini <= last) {
      int mid = ini + (last - ini) / 2;

      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        last = mid - 1;
      } else {
        ini = mid + 1;
      }
    }
    return ini;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter sorted array elements:");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    System.out.print("Enter target value: ");
    int target = sc.nextInt();

    // Method call
    int index = searchInsert(nums, target);

    // Display section
    System.out.println("Target position: " + index);

    sc.close();
  }
}
