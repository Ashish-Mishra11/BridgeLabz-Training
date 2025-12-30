import java.util.Scanner;

class MaxPower {

    public static int maxPower(String s) {
        int n = s.length();
        int count = 1;
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int result = maxPower(input);
        System.out.println("Maximum power (length of longest consecutive characters): " + result);

        sc.close();
    }
}
