/*17. Online Quiz Application 
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.*/

import java.util.Scanner;

public class OnlineQuizApplication {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // create the 2d string to store the questions and answers
    System.out.println("========================================");
    System.out.println("           Welcome to the Quiz          ");
    System.out.println("========================================");
   
    String [][]ques = {
      {
        "Q1. What is the capital of India?",
        "A. Delhi",
        "B. Mumbai",
        "C. Chennai",
        "D. Kolkata"
      },
      {
        "Q2. Which keyword is used to inherit a class in Java?",
        "A. this",
        "B. super",
        "C. extends",
        "D. implements"
      },
      {
        "Q3. Which of the following is not a primitive data type?",
        "A. int",
        "B. float",
        "C. String",
        "D. char"
      },
      {
        "Q4. Which method is the entry point of a Java program?",
        "A. start()",
        "B. run()",
        "C. main()",
        "D. init()"
      },
      {
        "Q5. Which operator is used to compare two values?",
        "A. =",
        "B. ==",
        "C. !=",
        "D. +"
      }
    };

    char ans1[] = {'a','c','c','c','b'};
    int score = 0;
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j<5; j++) {
        System.out.println(ques[i][j]);
      }
      System.out.println();
      char ans;
 
      do{
        System.out.print("Enter the choice for correct answer(a,b,c,d): ");
        ans = sc.next().toLowerCase().charAt(0);
      } while(ans != 'a' && ans != 'b' && ans != 'c' && ans != 'd' );

      char ch = ans1[i];
      switch(ans) {
        case 'a' -> {
          if(ans1[i] == 'a'){
            score++; 
            System.out.println("Correct answer ");
          } else {
            System.out.println("Wrong answer");
          }
          
        }
        case 'b' -> {
          if(ans1[i] == 'b'){
            score++;
            System.out.println("Correct answer ");
          } else {
            System.out.println("Wrong answer");
          }
          
        }
        case 'c' -> {
          if(ans1[i] == 'c'){
            score++;
            System.out.println("Correct answer ");
          } else {
            System.out.println("Wrong answer");
          }
          
        }
        case 'd' -> {
          if(ans1[i] == 'd'){
            score++;
            System.out.println("Correct answer ");
          } else {
            System.out.println("Wrong answer");
          }
          
        }

      }
      System.out.println();
    }
  
    // Display the results
    System.out.println("========================================");
    System.out.println("               Your Result              ");
    System.out.println("========================================");
    System.out.println("  Total score are : "+ score);    
  }
}