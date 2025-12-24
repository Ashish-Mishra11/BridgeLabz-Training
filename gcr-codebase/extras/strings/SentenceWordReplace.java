import java.util.Scanner;

public class SentenceWordReplace {

  // Method to replace a word with another word in a sentence
  public static String replaceWord(String sentence, String oldWord, String newWord) {
    String ans = "";
    String[] words = sentence.split(" ");

    for (int i = 0; i < words.length; i++) {
      if (words[i].equals(oldWord)) {
        ans += newWord;
      } else {
        ans += words[i];
      }

      if (i < words.length - 1) {
        ans += " ";
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section
    System.out.println("Enter the sentence: ");
    String sentence = sc.nextLine();
    System.out.println("Enter the word to replace: ");
    String oldWord = sc.next();
    System.out.println("Enter the new word: ");
    String newWord = sc.next();

    // Method calling
    String result = replaceWord(sentence, oldWord, newWord);

    // Display result
    System.out.println("Modified Sentence: " + result);

    sc.close();
  }
}
