import java.util.Scanner;

public class ConsonantsAndVowels {
  
  // Method to count the vowels and consonants
  public static int[] findCountVowelsAndConsonants(String s) {
    int countConsonants = 0;
    int countVowels = 0;
    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u' ||
         ch == 'A' || ch =='E' || ch=='I' || ch=='O' || ch=='U') {
        countVowels++;
      } else {
        countConsonants++;
      }
    }
    return new int[] {countVowels, countConsonants};
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    //Input section: take the user inputs
    System.out.println("Enter the string: ");
    String s = sc.next();

    // Method calling
    int []count = findCountVowelsAndConsonants( s);

    // Display results
    System.out.println("No. of vowels are: "+ count[0]);
    System.out.println("No. of consonants are: "+count[1]);

    sc.close();
  }
}