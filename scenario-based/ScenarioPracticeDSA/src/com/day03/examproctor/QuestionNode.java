package com.day03.examproctor;
import java.util.Stack;

class QuestionNode {

    Stack<Integer> navigationStack = new Stack<>();

    void visitQuestion(int questionId) {
        navigationStack.push(questionId);
    }

    void showVisitedQuestions() {
        System.out.println("Question navigation order");
        while (!navigationStack.isEmpty()) {
            System.out.println("Question " + navigationStack.pop());
        }
    }
}
