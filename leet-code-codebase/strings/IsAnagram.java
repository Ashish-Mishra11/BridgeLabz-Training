import java.util.Arrays;
import java.util.Scanner;

class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        char c[] = s.toCharArray();
        char e[] = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(e);
        if (Arrays.equals(c, e)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}
