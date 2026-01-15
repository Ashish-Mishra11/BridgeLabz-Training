package com.day03.examproctor;
import java.util.HashMap;

class ScoreCalculator {

    int calculateScore(HashMap<Integer, String> studentAnswers) {

        HashMap<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");

        int score = 0;

        for (int key : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(key)) {
                if (studentAnswers.get(key).equals(correctAnswers.get(key))) {
                    score++;
                }
            }
        }
        return score;
    }
}
