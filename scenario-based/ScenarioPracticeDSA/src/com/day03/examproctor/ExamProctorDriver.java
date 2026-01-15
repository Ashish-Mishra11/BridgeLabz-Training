package com.day03.examproctor;
import java.util.Scanner;

public class ExamProctorDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QuestionNode navigator = new QuestionNode();
        AnswerManager manager = new AnswerManager();
        ScoreCalculator calculator = new ScoreCalculator();

        System.out.print("Enter number of questions ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter question id ");
            int qId = sc.nextInt();
            sc.nextLine();

            navigator.visitQuestion(qId);

            System.out.print("Enter answer ");
            String ans = sc.nextLine();

            manager.storeAnswer(qId, ans);
        }

        int score = calculator.calculateScore(manager.answerMap);

        System.out.println("Final score " + score);

        navigator.showVisitedQuestions();

        sc.close();
    }
}
