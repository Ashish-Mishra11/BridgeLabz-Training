import java.util.Scanner;

class RemoveOuterParentheses {

    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(') {
                if (count != 0) {
                    sb.append(s.charAt(i));
                }
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
                if (count != 0) {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a valid parentheses string: ");
        String input = sc.nextLine();

        String result = removeOuterParentheses(input);
        System.out.println("After removing outer parentheses: " + result);

        sc.close();
    }
}
