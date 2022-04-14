package com.example.whowantstobemillionaire.levels;

public class Answer {
    private String answer;
    private String answerOption;
    private boolean isCorrect;

    public Answer(String answer, String answerOption, boolean isCorrect) {
        this.answer = answer;
        this.answerOption = answerOption;
        this.isCorrect = isCorrect;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswerOption() {
        return answerOption;
    }

    public void setAnswerOption(String answerOption) {
        this.answerOption = answerOption;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
