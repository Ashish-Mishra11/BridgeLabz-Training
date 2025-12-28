import java.util.Scanner;

class MaxDepth {

    // Method to find max depth
    public static int maxDepth(String s) {
        int n = s.length();
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                max = Math.max(max, count);
                count--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.print("Enter a string with parentheses: ");
        String input = sc.nextLine();

        // Method calling
        int result = maxDepth(input); 

        // Display section
        System.out.println("Maximum depth of parentheses: " + result);

        sc.close();
    }
}
