package com.example.whowantstobemillionaire.help;

import com.example.whowantstobemillionaire.levels.Answer;
import com.example.whowantstobemillionaire.levels.Question;

public class FiftyFiftyHelp extends HelpOption {
    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        Answer correctHelpAnswer = question.getCorrectAnswer(question.getAnswers()),
                wrongHelpAnswer = question.getRandomWrongAnswers(question.getWrongAnswers(question.getAnswers()));
        return new HelpAnswer[]{
                new HelpAnswer(correctHelpAnswer, 50),
                new HelpAnswer(wrongHelpAnswer, 50),
        };
    }

    public void printAnswers(HelpAnswer[] helpAnswers) {
        for (HelpAnswer answers : helpAnswers) {
            System.out.println(answers.getAnswer().getAnswerOption() + ": " + answers.getAnswer().getAnswer() + " ---> " + answers.getProbability() + "%");
        }
    }


}
