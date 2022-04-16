package com.example.whowantstobemillionaire.levels;

import java.util.Arrays;
import java.util.Random;

public class QuestionsAndAnswers {
    final Answer[] ANSWERS_1_LEVEL_1 =  {
            new Answer("stat", "a", false),
            new Answer("casa", "b", true),
            new Answer("soare", "c", false),
            new Answer("viata", "d", false),
    };
    final Answer[] ANSWERS_2_LEVEL_1 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_3_LEVEL_1 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_4_LEVEL_1 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_1_LEVEL_2 =  {
            new Answer("stat", "a", false),
            new Answer("casa", "b", true),
            new Answer("soare", "c", false),
            new Answer("viata", "d", false),
    };
    final Answer[] ANSWERS_2_LEVEL_2 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_3_LEVEL_2 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_4_LEVEL_2 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_1_LEVEL_3 =  {
            new Answer("stat", "a", false),
            new Answer("casa", "b", true),
            new Answer("soare", "c", false),
            new Answer("viata", "d", false),
    };
    final Answer[] ANSWERS_2_LEVEL_3 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_3_LEVEL_3 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_4_LEVEL_3 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_1_LEVEL_4 =  {
            new Answer("stat", "a", false),
            new Answer("casa", "b", true),
            new Answer("soare", "c", false),
            new Answer("viata", "d", false),
    };
    final Answer[] ANSWERS_2_LEVEL_4 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_3_LEVEL_4 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_4_LEVEL_4 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_1_LEVEL_5 =  {
            new Answer("stat", "a", false),
            new Answer("casa", "b", true),
            new Answer("soare", "c", false),
            new Answer("viata", "d", false),
    };
    final Answer[] ANSWERS_2_LEVEL_5 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_3_LEVEL_5 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };
    final Answer[] ANSWERS_4_LEVEL_5 =  {
            new Answer("raspuns1", "a", false),
            new Answer("raspuns2", "b", true),
            new Answer("raspuns3", "c", false),
            new Answer("raspuns4", "d", false),
    };

    final Question[] LEVEL_1 = {
            new Question("Prefixul „eco” vine de la un cuvânt grecesc care înseamnă:", ANSWERS_1_LEVEL_1, 1, 100),
            new Question("Intrebarea 2 level 1", ANSWERS_2_LEVEL_1, 1, 100),
            new Question("Intrebarea 3 level 1", ANSWERS_3_LEVEL_1, 1, 100),
            new Question("Intrebarea 4 level 1", ANSWERS_4_LEVEL_1, 1, 100),
    };
    final Question[] LEVEL_2 = {
            new Question("Intrebarea 1 level 2", ANSWERS_1_LEVEL_2, 1, 100),
            new Question("Intrebarea 2 level 2", ANSWERS_2_LEVEL_2, 1, 100),
            new Question("Intrebarea 3 level 2", ANSWERS_3_LEVEL_2, 1, 100),
            new Question("Intrebarea 4 level 2", ANSWERS_4_LEVEL_2, 1, 100),
    };
    final Question[] LEVEL_3 = {
            new Question("Intrebarea 1 level 3", ANSWERS_1_LEVEL_3, 1, 100),
            new Question("Intrebarea 2 level 3", ANSWERS_2_LEVEL_3, 1, 100),
            new Question("Intrebarea 3 level 3", ANSWERS_3_LEVEL_3, 1, 100),
            new Question("Intrebarea 4 level 3", ANSWERS_4_LEVEL_3, 1, 100),
    };
    final Question[] LEVEL_4 = {
            new Question("Intrebarea 1 level 4", ANSWERS_1_LEVEL_4, 1, 100),
            new Question("Intrebarea 2 level 4", ANSWERS_2_LEVEL_4, 1, 100),
            new Question("Intrebarea 3 level 4", ANSWERS_3_LEVEL_4, 1, 100),
            new Question("Intrebarea 4 level 4", ANSWERS_4_LEVEL_4, 1, 100),
    };
    final Question[] LEVEL_5= {
            new Question("Intreabarea 1 level 5", ANSWERS_1_LEVEL_5, 1, 100),
            new Question("Intrebarea 2 level 5", ANSWERS_2_LEVEL_5, 1, 100),
            new Question("Intrebarea 3 level 5", ANSWERS_3_LEVEL_5, 1, 100),
            new Question("Intrebarea 4 level 5", ANSWERS_4_LEVEL_5, 1, 100),
    };



    // TODO: method gets current level and returns an object for print method
    public Question getQuestionByLevel(int level) {
        getRandomQuestion(LEVEL_1);
        return switch (level) {
            case 2 -> getRandomQuestion(LEVEL_2);
            case 3 -> getRandomQuestion(LEVEL_3);
            case 4 -> getRandomQuestion(LEVEL_4);
            case 5 -> getRandomQuestion(LEVEL_5);
            default -> getRandomQuestion(LEVEL_1);
        };
    }


    private Question getRandomQuestion(Question[] question) {
        return question[new Random().nextInt(question.length)];
    }

    public void printQuestionsAndAnswers(Question question, int currentLevel) {
        System.out.println("● Nivelul " + currentLevel);
        System.out.println();
        System.out.println("≫ " + question.getQuestion());


    }

}
