import java.util.Scanner;

class MinimumRecolors {

    public static int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int r = 0;
        int l = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        while (r < n) {
            if (blocks.charAt(r) == 'W') {
                count++;
            }
            if (r - l == k - 1) {
                min = Math.min(count, min);
                if (blocks.charAt(l) == 'W') {
                    count--;
                }
                l++;
            }
            r++;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the blocks string (only 'B' and 'W'): ");
        String blocks = sc.nextLine();

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        int result = minimumRecolors(blocks, k);
        System.out.println("Minimum recolors needed: " + result);

        sc.close();
    }
}
