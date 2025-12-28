import java.util.Scanner;

class RotateString {

    public static boolean rotateString(String s, String goal) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.equals(goal)) {
                return true;
            } else {
                s = s.substring(1, n) + s.substring(0, 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String s = sc.nextLine();

        System.out.print("Enter the goal string: ");
        String goal = sc.nextLine();

        boolean result = rotateString(s, goal);

        if (result) {
            System.out.println("The string can be rotated to match the goal.");
        } else {
            System.out.println("The string cannot be rotated to match the goal.");
        }

        sc.close();
    }
}
