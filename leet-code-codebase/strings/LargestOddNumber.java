import java.util.Scanner;

class LargestOddNumber {

    public static String largestOddNumber(String num) {
        int n = num.length();
        int flag = 0;
        if ((num.charAt(n - 1) - '0') % 2 != 0) {
            return num;
        } else {
            for (int i = n - 1; i >= 0; i--) {
                if ((num.charAt(i) - '0') % 2 != 0) {
                    flag = 1;
                    num = num.substring(0, i + 1);
                    break;
                }
            }
        }
        if (flag == 0) {
            num = "";
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numeric string: ");
        String num = sc.nextLine();

        String result = largestOddNumber(num);
        System.out.println("Largest odd number substring: " + result);

        sc.close();
    }
}
