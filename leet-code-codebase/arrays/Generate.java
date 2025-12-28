import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Generate {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> ll = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    ll.add(1);
                } else if (j == i) {
                    ll.add(1);
                } else {
                    ll.add(l.get(i - 1).get(j) + l.get(i - 1).get(j - 1));
                }
            }
            l.add(ll);
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        List<List<Integer>> result = generate(numRows);

        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }

        sc.close();
    }
}
