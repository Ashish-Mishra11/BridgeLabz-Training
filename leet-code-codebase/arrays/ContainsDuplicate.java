import java.util.Arrays;
import java.util.Scanner;

class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int a = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (a == nums[i]) {
                count++;
                if (count >= 2) {
                    return true;
                }
            } else {
                a = nums[i];
                count = 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = containsDuplicate(nums);
        if (result) {
            System.out.println("Array contains duplicate elements.");
        } else {
            System.out.println("Array does not contain duplicate elements.");
        }

        sc.close();
    }
}
