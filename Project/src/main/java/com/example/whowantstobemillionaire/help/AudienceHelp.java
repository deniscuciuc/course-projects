package com.example.whowantstobemillionaire.help;

import com.example.whowantstobemillionaire.levels.Answer;
import com.example.whowantstobemillionaire.levels.Question;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AudienceHelp extends HelpOption {
    @Override
    public ArrayList<HelpAnswer> getHelpAnswers(Question question) {

        ArrayList<HelpAnswer> helpWrongAnswers = new ArrayList<>();
        ArrayList<Answer> wrongAnswers = question.getWrongAnswers(question.getAnswers());
        Answer correctAnswer = question.getCorrectAnswer(question.getAnswers());

        helpWrongAnswers.add(new HelpAnswer(correctAnswer, 70));
        helpWrongAnswers.add(new HelpAnswer(wrongAnswers.get(0), 10));
        helpWrongAnswers.add(new HelpAnswer(wrongAnswers.get(1), 10));
        helpWrongAnswers.add(new HelpAnswer(wrongAnswers.get(2), 10));

        return helpWrongAnswers;
    }
}
