/* 7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries */

import java.util.Scanner;

public class NumberGuessingGame {
  
  // Method to generate the number 
  public static int generateNumber() {
    return (int)(Math.random() * 100) + 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int totalGuess = 0;
    System.out.println("Please guess the number between 1 and 100");
    int guessNumber;
    int generatedNumber = generateNumber();
    System.out.println("------------Number guessing game------------------");    

    do {
      // Input section: Take the user inputs
      System.out.println("Enter the guess: ");
      guessNumber = sc.nextInt();
       
      if(guessNumber == generatedNumber) {
        System.out.println("your guess is correct");
        break;
      } else if(guessNumber > generatedNumber) {
        System.out.println("Too high");
      } else {
        System.out.println("Too low");
      }
      totalGuess++;
    } while(totalGuess < 5);
  
    // printing the run out of attempts message
    if (generatedNumber != guessNumber) {
      System.out.println("you run out of attempts");
    }
 
    sc.close();
  }
}