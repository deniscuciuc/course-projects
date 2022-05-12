package com.example.whowantstobemillionaire;

import com.example.whowantstobemillionaire.help.FiftyFiftyHelp;
import com.example.whowantstobemillionaire.help.HelpAnswer;
import com.example.whowantstobemillionaire.levels.Levels;
import com.example.whowantstobemillionaire.levels.Question;

import java.util.Scanner;

public class ConsoleGame {
    public void launchGame() {
        int currentLevel = 1, currentScore = 0;
        Levels questionsAndAnswers = new Levels();
        Question currentLevelQuestion;
        HelpAnswer helpAnswer = new HelpAnswer();
        FiftyFiftyHelp fiftyFiftyHelp = new FiftyFiftyHelp();

        Scanner answerObj = new Scanner(System.in);
        String userAnswer;

        System.out.println("=== Cine vrea sa fie milionar? ===");
        while (currentLevel <= 5) {
            currentLevelQuestion  = questionsAndAnswers.getQuestionByLevel(currentLevel);
            questionsAndAnswers.printLevel(currentLevelQuestion, currentLevel);

            System.out.print("Raspunsul tau este: ");
            userAnswer = answerObj.nextLine();
            if (helpAnswer.verifyAnswer(userAnswer)) {
                switch (userAnswer) {
                    case "A":
                        fiftyFiftyHelp.printAnswers(fiftyFiftyHelp.getHelpAnswers(currentLevelQuestion));
                    case "P":
                        
                }
            } else if (currentLevelQuestion.verifyAnswer(currentLevelQuestion, userAnswer)) {
                currentScore += currentLevelQuestion.getScore();
                System.out.println("Raspuns corect! (◕‿◕) Scorul curent: " + currentScore);
            } else {
                System.out.println("Raspuns gresit! (￢_￢)  Scorul acumulat: " + currentScore);
                questionsAndAnswers = null;
                currentLevelQuestion = null;
                answerObj.close();
                currentLevel = 1;
                return;
            }
            currentLevel++;
        }
        System.out.println();
        System.out.println("Felicitări! Ați câștigat jocul.");
    }
}
