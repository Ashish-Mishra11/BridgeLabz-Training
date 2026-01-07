package com.day04.edumentor;
public class EduMentorDriver {
    public static void main(String[] args) {

        Learner l1 = new Learner("Anuradha", "anu@gmail.com", 101, true);
        Learner l2 = new Learner("Riya", "riya@gmail.com", 102, false);

        String[] questions = {
            "What is Java?",
            "What is OOP?",
            "What is inheritance?"
        };

        int[] correctAnswers = {1, 2, 3};

        Quiz quiz = new Quiz(questions, correctAnswers, 2);

        int[] learnerAnswers = {1, 2, 1};
        quiz.attemptQuiz(learnerAnswers);

        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + quiz.getPercentage());

        l1.generateCertificate();
        l2.generateCertificate();
    }
}
