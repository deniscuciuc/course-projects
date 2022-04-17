package com.example.whowantstobemillionaire;

import com.example.whowantstobemillionaire.levels.Question;
import com.example.whowantstobemillionaire.levels.QuestionsAndAnswers;

import java.util.Scanner;

public class ConsoleGame {
    public void launchGame() {
        boolean isAnswerCorrect = true;
        int currentLevel = 1;

        QuestionsAndAnswers test = new QuestionsAndAnswers();
        Question currentLevelObj;

        Scanner answerObj = new Scanner(System.in);
        String answer;

        System.out.println("=== Cine vrea sa fie milionar? ===");
        while (isAnswerCorrect && currentLevel <= 5) {
            currentLevelObj  = test.getQuestionByLevel(currentLevel);
            test.printQuestionsAndAnswers(currentLevelObj, currentLevel);
            answer = answerObj.nextLine();
            System.out.println("Raspunsul tau este: " + answer);
            currentLevel++;
        }
    }
}
