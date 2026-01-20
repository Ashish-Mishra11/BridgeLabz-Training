import java.util.Scanner;

class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        Boolean sb = true;
        int a = Integer.MAX_VALUE;
        int flag = 0;
        int flag2 = 0;

        if (n < 3) {
            sb = false;
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == 0) {
                sb = false;
                break;
            } 
            else if (arr[i] - arr[i - 1] < 0) {
                flag = 1;
                a = i;
            } 
            else if (i > a && arr[i] - arr[i - 1] > 0) {
                sb = false;
            }

            if (arr[i] - arr[i - 1] > 0) {
                flag2 = 1;
            }
        }

        if (flag == 1 && flag2 == 1) {
            return sb;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ValidMountainArray obj = new ValidMountainArray();
        boolean result = obj.validMountainArray(arr);

        System.out.println("Is valid mountain array: " + result);

        sc.close();
    }
}
