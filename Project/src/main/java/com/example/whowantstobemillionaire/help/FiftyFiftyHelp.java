package com.example.whowantstobemillionaire.help;

import com.example.whowantstobemillionaire.levels.Answer;
import com.example.whowantstobemillionaire.levels.Question;

import java.util.ArrayList;

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


    public ArrayList<Answer> getWrongHelpAnswers(Question question) {
        ArrayList<Answer> wrongHelpAnswers = new ArrayList<>();
        do {
            wrongHelpAnswers.add(question.getRandomWrongAnswers(question.getWrongAnswers(question.getAnswers())));
            wrongHelpAnswers.add(question.getRandomWrongAnswers(question.getWrongAnswers(question.getAnswers())));
        } while (wrongHelpAnswers.get(0) == wrongHelpAnswers.get(1));

        return wrongHelpAnswers;
    }


    public void printAnswers(ArrayList<HelpAnswer> helpAnswers) {
        for (HelpAnswer answers : helpAnswers) {
            System.out.println(answers.getAnswer().getAnswerOption() + ": " + answers.getAnswer().getAnswer() + " ---> " + answers.getProbability() + "%");
        }
    }
}
