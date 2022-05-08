package com.example.whowantstobemillionaire.help;

import com.example.whowantstobemillionaire.levels.Answer;

public class HelpAnswer {
    private Answer answer;
    private double probability;

    public HelpAnswer(Answer answer, double probability) {
        this.answer = answer;
        this.probability = probability;
    }

    public HelpAnswer() {

    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public boolean verifyAnswer(String answer) {
        HelpOptions[] helpOptions =  HelpOptions.values();
        for (HelpOptions options : helpOptions) {
            if (answer.equals(options.name())) {
                return true;
            }
        }
        return false;
    }
}
