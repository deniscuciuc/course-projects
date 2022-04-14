package com.example.whowantstobemillionaire.levels;

public class QuestionsAndAnswers {
    final Answer[] ANSWERS_LEVEL_1 =  {
            new Answer("stat", "a", false),
            new Answer("casa", "b", true),
            new Answer("soare", "c", false),
            new Answer("viata", "d", false),
    };
    final Answer[] ANSWERS_LEVEL_2 =  {
            new Answer("stat", "a", false),
            new Answer("casa", "b", true),
            new Answer("soare", "c", false),
            new Answer("viata", "d", false),
    };
    final Question QUESTION_1_LEVEL_1 = new Question("Prefixul „eco” vine de la un cuvânt grecesc care înseamnă:", ANSWERS_LEVEL_1, 1, 100);
    final Question QUESTION_1_LEVEL_2 = new Question("Prefixul „eco” vine de la un cuvânt grecesc care înseamnă:", ANSWERS_LEVEL_2, 2, 100);
}
