package com.example.whowantstobemillionaire.levels;

import java.util.ArrayList;
import java.util.Random;

public class Question {
    private String question;
    private int level;
    private int score;
    private ArrayList<Answer> answers;

    public Question(String question, ArrayList<Answer> answers, int level, int score) {
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

    public ArrayList<Answer> getAnswers() { return answers; }


    public Answer getCorrectAnswer(ArrayList<Answer> answers) {
        for (Answer correctAnswer : answers) {
            if (correctAnswer.isCorrect()) {
                return correctAnswer;
            }
        }
        return null;
    }


    public ArrayList<Answer> getWrongAnswers(ArrayList<Answer> answers) {
        ArrayList<Answer> wrongAnswers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (!answers.get(i).isCorrect()) {
                wrongAnswers.add(answers.get(i));
            }
        }
        return wrongAnswers;
    }

    public Answer getRandomWrongAnswers(ArrayList<Answer> wrongAnswers) {
        return wrongAnswers.get(new Random().nextInt(wrongAnswers.size()));
    }

    public boolean verifyAnswer(Question question, String answer) {
        return answer.equalsIgnoreCase(question.getCorrectAnswer(question.getAnswers()).getAnswerOption().toString());
    }
}
