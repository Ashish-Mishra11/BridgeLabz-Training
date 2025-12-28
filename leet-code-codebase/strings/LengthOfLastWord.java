import java.util.Scanner;

class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(n - 1 - i) == ' ' && count == 0) {
                count = count;
            } else if (s.charAt(n - 1 - i) == ' ' && count != 0) {
                return count;
            } else {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int length = lengthOfLastWord(input);
        System.out.println("Length of last word: " + length);

        sc.close();
    }
}
