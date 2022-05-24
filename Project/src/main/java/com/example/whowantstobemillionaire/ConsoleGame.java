package com.example.whowantstobemillionaire;

import com.example.whowantstobemillionaire.help.FiftyFiftyHelp;
import com.example.whowantstobemillionaire.help.HelpAnswer;
import com.example.whowantstobemillionaire.help.HelpOption;
import com.example.whowantstobemillionaire.levels.Levels;
import com.example.whowantstobemillionaire.levels.Question;

import java.util.Scanner;

public class ConsoleGame {
    public void launchGame() {
        int currentLevel = 1, score = 0;
        boolean gameOn = true;

        Levels currentQuestionLevel = new Levels();
        Question currentQuestionObj;

        Scanner userAnswerObj = new Scanner(System.in);
        String userAnswer;

        System.out.println("Cine vrea sa fie millionar?");
        while (gameOn) {
            currentQuestionObj = currentQuestionLevel.getQuestionByLevel(currentLevel);
            currentQuestionLevel.printLevel(currentQuestionObj, currentLevel);

            System.out.println("Raspunsul tau este: ");
            userAnswer = userAnswerObj.nextLine();



            if (currentQuestionObj.verifyAnswer(currentQuestionObj, userAnswer)) {
                currentLevel++;
                score += currentQuestionObj.getScore();
                System.out.println("Raspuns corect! Scorul curent: " + score);
            } else {
                System.out.println("Raspuns incorect! Ati pierdut jocul");
                System.out.println("Scorul acumulat: " + score);
                gameOn = false;
            }

            if (currentLevel >= 5) {
                gameOn = false;
            }
        }
    }
}
