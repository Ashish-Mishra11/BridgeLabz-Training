import java.util.Scanner;

class MaxProfit {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int j = 0;
        int p = 0;
        int mp = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
                j = i;
            } else {
                p = prices[i] - min;
                mp = Math.max(mp, p);
            }
        }

        int max = min;
        for (int i = j; i < n; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }

        int a = max - min;
        int c = 0;
        if (mp > a) {
            c = mp;
        } else {
            c = a;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);
        System.out.println("Maximum profit: " + result);

        sc.close();
    }
}
