package com.example.whowantstobemillionaire.levels;

import com.example.whowantstobemillionaire.enums.AnswerOptions;

public class Answer {
    private String answer;
    private AnswerOptions answerOption;
    private boolean isCorrect;

    public Answer(String answer, AnswerOptions answerOption, boolean isCorrect) {
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

    public AnswerOptions getAnswerOption() {
        return answerOption;
    }

    public void setAnswerOption(AnswerOptions answerOption) {
        this.answerOption = answerOption;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

}
