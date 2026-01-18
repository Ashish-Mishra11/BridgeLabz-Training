import java.util.Arrays;
import java.util.Scanner;

class DefuseTheBomb {

    public int[] decrypt(int[] code, int k) {
        int length = code.length;
        int[] newArr = new int[length];

        if (k == 0) {
            Arrays.fill(newArr, 0);
        } 
        else if (k < 0) {
            k = -k;
            int i = 0;
            int count = 0;
            int l = 0;
            int sum = 0;

            while (i < length) {
                l = (length + i) - k;
                if (l > length - 1) {
                    l = l - length;
                }

                while (count < k) {
                    if (l > length - 1) {
                        l = l - length;
                    }
                    sum = sum + code[l];
                    l++;
                    count++;
                }

                newArr[i] = sum;
                i++;
                count = 0;
                sum = 0;
            }
        } 
        else {
            int i = 0;
            int count = 0;
            int l = 0;
            int sum = 0;

            while (i < length) {
                l = i + 1;
                if (l > length - 1) {
                    l = l - length;
                }

                while (count < k) {
                    if (l > length - 1) {
                        l = l - length;
                    }
                    sum = sum + code[l];
                    l++;
                    count++;
                }

                newArr[i] = sum;
                i++;
                count = 0;
                sum = 0;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] code = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            code[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        DefuseTheBomb obj = new DefuseTheBomb();
        int[] result = obj.decrypt(code, k);

        System.out.println("Decrypted array:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
