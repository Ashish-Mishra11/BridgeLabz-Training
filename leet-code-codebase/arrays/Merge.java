import java.util.Arrays;
import java.util.Scanner;

class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }

        for (int i = 0; i < m + n; i++) {
            boolean swapped = false;
            for (int j = 0; j < (m + n) - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of m: ");
        int m = sc.nextInt();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        System.out.println("Enter elements of nums1 (first m elements):");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        sc.close();
    }
}
