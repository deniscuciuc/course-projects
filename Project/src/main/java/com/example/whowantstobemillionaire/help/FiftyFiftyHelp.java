package com.example.whowantstobemillionaire.help;

import com.example.whowantstobemillionaire.levels.Answer;
import com.example.whowantstobemillionaire.levels.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class FiftyFiftyHelp extends HelpOption {
    @Override
    public ArrayList<HelpAnswer> getHelpAnswers(Question question) {
        Answer correctHelpAnswer = question.getCorrectAnswer(question.getAnswers()),
                wrongHelpAnswer = question.getRandomWrongAnswers(question.getWrongAnswers(question.getAnswers()));
        ArrayList<HelpAnswer> helpAnswers = new ArrayList<>();
        helpAnswers.add(new HelpAnswer(correctHelpAnswer, 50));
        helpAnswers.add(new HelpAnswer(wrongHelpAnswer, 50));
        return helpAnswers;
    }

    public void printAnswers(ArrayList<HelpAnswer> helpAnswers) {
        for (HelpAnswer answers : helpAnswers) {
            System.out.println(answers.getAnswer().getAnswerOption() + ": " + answers.getAnswer().getAnswer() + " ---> " + answers.getProbability() + "%");
        }
    }
}
