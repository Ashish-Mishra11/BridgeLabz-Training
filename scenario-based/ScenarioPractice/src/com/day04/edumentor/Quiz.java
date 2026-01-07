package com.day04.edumentor;
class Quiz {
	private String[] questions;
    private final int[] answers;
    private int score;
    private int difficultyLevel;

    Quiz(String[] questions, int[] answers, int difficultyLevel) {
        this.questions = questions;
        this.answers = answers;
        this.difficultyLevel = difficultyLevel;
        this.score = 0;
    }

    public void attemptQuiz(int[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (userAnswers[i] == answers[i]) {
                score++;
            }
        }
    }

    public double getPercentage() {
        return (double) score / answers.length * 100;
    }

    public int getScore() {
        return score;
    }
}
