import java.util.Scanner;

class CheckIfArrayIsSortedAndRotated {

    public boolean check(int[] nums) {
        int a = nums[0];
        int count = 0;
        int flag = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                flag = 1;
                if (count > 1) {
                    return false;
                }
            }
            if (flag == 1 && nums[i] > a) {
                return false;
            }
        }

        return true;
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

        CheckIfArrayIsSortedAndRotated obj = new CheckIfArrayIsSortedAndRotated();
        boolean result = obj.check(nums);

        System.out.println("Is array sorted and rotated: " + result);

        sc.close();
    }
}
