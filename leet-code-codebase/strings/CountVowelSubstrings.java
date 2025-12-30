import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class CountVowelSubstrings {

    public static int countVowelSubstrings(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int count = 0;
        int count1 = 0;
        int lr = 0;
        int n = word.length();
        int max = 0;
        int max1 = 0;
        int flag = 0;
        int total = 0;

        while (r < n) {

            char ch = word.charAt(r);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count1 += (r - lr + 1);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                // Corrected the inner while loop
                while (map.keySet().containsAll(Set.of('a', 'e', 'i', 'o', 'u'))) {
                    flag = 1;
                    char leftChar = word.charAt(l);
                    map.put(leftChar, map.get(leftChar) - 1);
                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                    }
                    l++;
                }

                count += (r - l + 1);

            } else {
                total = total + (count1 - count);
                l = r + 1;
                lr = r + 1;
                count1 = 0;
                count = 0;
                map.clear();
                r++;
                continue;
            }

            r++;
        }
        total = total + (count1 - count);
        if (flag == 1) {
            return total;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        int result = countVowelSubstrings(word);
        System.out.println("Number of vowel substrings containing all vowels: " + result);

        sc.close();
    }
}
