package com.example.whowantstobemillionaire.help;

import com.example.whowantstobemillionaire.levels.Answer;

public class HelpAnswer {
    private Answer answer;
    private double probability;

    public HelpAnswer(Answer answer, double probability) {
        this.answer = answer;
        this.probability = probability;
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

    public static void printHelpMenu() {
        System.out.println("----- Ajutor ------");
        System.out.println("F - 50/50 | P - Suna un prieten | A - Intreaba publicul");
    }
}
