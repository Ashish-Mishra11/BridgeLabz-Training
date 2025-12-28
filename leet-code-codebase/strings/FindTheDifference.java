import java.util.Scanner;

class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        char res = 0;
        int n = t.length();
        int m = s.length();
        for (int i = 0; i < n; i++) {
            if (i < m) {
                res ^= s.charAt(i);
            }
            res ^= t.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string (s): ");
        String s = sc.nextLine();

        System.out.print("Enter second string (t): ");
        String t = sc.nextLine();

        char result = findTheDifference(s, t);
        System.out.println("The differing character is: " + result);

        sc.close();
    }
}
