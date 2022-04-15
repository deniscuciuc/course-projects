package com.example.whowantstobemillionaire;

import com.example.whowantstobemillionaire.levels.Question;
import com.example.whowantstobemillionaire.levels.QuestionsAndAnswers;

public class ConsoleGame {
    public void launchGame() {

        boolean isAnswerCorrect = true;
        int currentLevel = 1;
        QuestionsAndAnswers test = new QuestionsAndAnswers();
        Question currentLevelObj = test.getQuestionByLevel(currentLevel);
        test.printQuestionsAndAnswers(currentLevelObj);



    }
}
