import java.util.Scanner;
public class EqualCharArray {
  
  // Method section: create the method to generate the character array
  public static char[] generateCharArray(String s1) {
    char charArray[] = new char[s1.length()];
    for(int i = 0; i < s1.length(); i++) {
      charArray[i] = s1.charAt(i);
    }
    return charArray;
  }
  public static boolean compareCharArray(char charArray[], char charArray2[]) {
    if(charArray.length != charArray2.length) {
      return false;
    } else {
      for(int i = 0; i < charArray.length; i++) {
        if(charArray[i] != charArray2[i]) {
          return false;
        }
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Input section: take the inputs from the user
    System.out.println("Enter the string: ");
    String s1 = sc.next();

    char charArray[] = generateCharArray(s1);
    char charArray2[] = s1.toCharArray();


    boolean isSame= compareCharArray(charArray, charArray2);

    // Display results: display the results
    if(isSame) {
      System.out.println("Both char array are equal using both the methods");
    } else {
      System.out.println("Both char array are not equal using both the methods");
    }
 
    sc.close();
  }
}