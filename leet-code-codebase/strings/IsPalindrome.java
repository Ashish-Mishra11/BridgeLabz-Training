import java.util.Scanner;

class IsPalindrome {

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int n = s.length();
        int r = 0;
        int l = n - 1;
        while (r < l) {
            if (s.charAt(r) != s.charAt(l)) {
                return false;
            }
            r++;
            l--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input);
        if(result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
