import java.util.HashMap;
import java.util.Scanner;

class ContainsNearbyDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(nums[i]) && Math.abs(i - (h.get(nums[i]))) <= k) {
                return true;
            } else {
                h.put(nums[i], i);
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

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        boolean result = containsNearbyDuplicate(nums, k);

        if (result) {
            System.out.println("Nearby duplicate exists.");
        } else {
            System.out.println("No nearby duplicate found.");
        }

        sc.close();
    }
}
