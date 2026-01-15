package com.day03.examproctor;
import java.util.HashMap;

class AnswerManager {

    HashMap<Integer, String> answerMap = new HashMap<>();

    void storeAnswer(int questionId, String answer) {
        answerMap.put(questionId, answer);
    }
}
