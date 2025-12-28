import java.util.HashMap;
import java.util.Scanner;

class RomanToInt {

    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            int f = map.get(s.charAt(i));
            int g;

            if(i + 1 < s.length()) {
                g = map.get(s.charAt(i + 1));
                if(f < g) {
                    result += g - f;
                    i++;
                } else {
                    result += f;
                }
            } else {
                result += f;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman numeral: ");
        String s = sc.nextLine();

        int ans = romanToInt(s);
        System.out.println("Integer value: " + ans);

        sc.close();
    }
}
