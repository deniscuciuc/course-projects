package com.example.whowantstobemillionaire.levels;

import java.util.Random;

public class Question {
    private String question;
    private int level;
    private int score;
    private Answer[] answers;

    public Question(String question, Answer[] answers, int level, int score) {
        this.question = question;
        this.answers = answers;
        this.level = level;
        this.score = score;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Answer[] getAnswers() { return answers; }


    public Answer getCorrectAnswer(Answer[] answers) {
        for (Answer correctAnswer : answers) {
            if (correctAnswer.isCorrect()) {
                return correctAnswer;
            }
        }
        return null;
    }


    public Answer[] getWrongAnswers(Answer[] answers) {
        Answer[] wrongAnswers = new Answer[3];
        int i = 0;
        for (Answer wrongAnswer : answers) {
            if (!wrongAnswer.isCorrect()) {
                wrongAnswers[i] = wrongAnswer;
                i++;
            }
        }
        return wrongAnswers;
    }

    public Answer getRandomWrongAnswers(Answer[] wrongAnswers) {
        return wrongAnswers[new Random().nextInt(wrongAnswers.length)];
    }
}
