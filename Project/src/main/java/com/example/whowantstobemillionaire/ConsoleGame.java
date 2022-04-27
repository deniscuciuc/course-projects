package com.example.whowantstobemillionaire;

import com.example.whowantstobemillionaire.help.HelpAnswer;
import com.example.whowantstobemillionaire.levels.Question;
import com.example.whowantstobemillionaire.levels.QuestionsAndAnswers;

import java.util.Scanner;

public class ConsoleGame {
    public void launchGame() {
        boolean isAnswerCorrect = true;
        int currentLevel = 1, currentScore = 0;

        QuestionsAndAnswers questionsAndAnswers = new QuestionsAndAnswers();
        Question currentLevelObj;

        Scanner answerObj = new Scanner(System.in);
        String userAnswer;

        System.out.println("=== Cine vrea sa fie milionar? ===");
        while (isAnswerCorrect && currentLevel <= 5) {
            currentLevelObj  = questionsAndAnswers.getQuestionByLevel(currentLevel);
            questionsAndAnswers.printLevel(currentLevelObj, currentLevel);
            System.out.println();
            HelpAnswer.printHelpMenu();
            System.out.println();
            System.out.print("Raspunsul tau este: ");
            userAnswer = answerObj.nextLine();
            if (questionsAndAnswers.verifyAnswer(currentLevelObj, userAnswer)) {
                currentScore += currentLevelObj.getScore();
                System.out.println("Raspuns corect! (◕‿◕) Scorul curent: " + currentScore);
            } else {
                System.out.println("Raspuns gresit! (￢_￢)  Scorul acumulat: " + currentScore);
                return;
            }
            currentLevel++;
        }
        System.out.println();
        System.out.println("Felicitări! Ați câștigat jocul.");
    }
}
