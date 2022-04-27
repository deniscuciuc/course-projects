package com.example.whowantstobemillionaire.levels;

import java.util.Arrays;
import java.util.Random;

public class QuestionsAndAnswers {
    private final Answer[] ANSWERS_1_LEVEL_1 =  {
            new Answer("stat", "a", false),
            new Answer("casa", "b", true),
            new Answer("soare", "c", false),
            new Answer("viata", "d", false),
    };
    private final Answer[] ANSWERS_2_LEVEL_1 =  {
            new Answer("Australia", "a", false),
            new Answer("Brazilia", "b", true),
            new Answer("Africa de Sud", "c", false),
            new Answer("Indonezia", "d", false),
    };
    private final Answer[] ANSWERS_3_LEVEL_1 =  {
            new Answer("Pinot Grigio", "a", false),
            new Answer("Riesling", "b", false),
            new Answer("Cabernet Sauvignon", "c", true),
            new Answer("Chardonnay", "d", false),
    };
    private final Answer[] ANSWERS_4_LEVEL_1 =  {
            new Answer("Libia", "a", true),
            new Answer("Tunisia", "b", false),
            new Answer("Sudan", "c", false),
            new Answer("Egipt", "d", false),
    };
    private final Answer[] ANSWERS_1_LEVEL_2 =  {
            new Answer("BIOS", "a", false),
            new Answer("RAM", "b", false),
            new Answer("USB", "c", false),
            new Answer("Procesorul", "d", true),
    };
    private final Answer[] ANSWERS_2_LEVEL_2 =  {
            new Answer("Abu Dhabi", "a", false),
            new Answer("Manama", "b", false),
            new Answer("Doha", "c", false),
            new Answer("Ryadh", "d", true),
    };
    private final Answer[] ANSWERS_3_LEVEL_2 =  {
            new Answer("El Cano", "a", false),
            new Answer("El Greco", "b", false),
            new Answer("El Cid", "c", true),
            new Answer("El Salvador", "d", false),
    };
    private final Answer[] ANSWERS_4_LEVEL_2 =  {
            new Answer("Prahova", "a", false),
            new Answer("Alba", "b", true),
            new Answer("Buzău", "c", false),
            new Answer("Maramureş", "d", false),
    };
    private final Answer[] ANSWERS_1_LEVEL_3 =  {
            new Answer("gârbaci", "a", true),
            new Answer("gârliţă", "b", false),
            new Answer("gâză", "c", false),
            new Answer("gârniţă", "d", false),
    };
    private final Answer[] ANSWERS_2_LEVEL_3 =  {
            new Answer("giromanţie", "a", false),
            new Answer("acromanţie", "b", true),
            new Answer("meteoromanţie", "c", false),
            new Answer("nefelomanţie", "d", false),
    };
    private final Answer[] ANSWERS_3_LEVEL_3 =  {
            new Answer("Roma", "a", false),
            new Answer("Paris", "b", true),
            new Answer("Berlin", "c", false),
            new Answer("Atena", "d", false),
    };
    private final Answer[] ANSWERS_4_LEVEL_3 =  {
            new Answer("Palton", "a", false),
            new Answer("Pălărie", "b", true),
            new Answer("Pantof", "c", false),
            new Answer("Cravată", "d", false),
    };
    private final Answer[] ANSWERS_1_LEVEL_4 =  {
            new Answer("Van Eyck", "a", false),
            new Answer("Holbein", "b", true),
            new Answer("Mihailangelo", "c", false),
            new Answer("Rembrandt", "d", false),
    };
    private final Answer[] ANSWERS_2_LEVEL_4 =  {
            new Answer("Tenis pe gazon", "a", false),
            new Answer("Uniunea de rugby", "b", false),
            new Answer("Polo", "c", false),
            new Answer("Cricket", "d", true),
    };
    private final Answer[] ANSWERS_3_LEVEL_4 =  {
            new Answer("Coldplay", "a", false),
            new Answer("Toploader", "b", false),
            new Answer("A1", "c", false),
            new Answer("Craig David", "d", true),
    };
    private final Answer[] ANSWERS_4_LEVEL_4 =  {
            new Answer("Franța", "a", false),
            new Answer("Italia", "b", false),
            new Answer("Olanda", "c", false),
            new Answer("Elveția", "d", true),
    };
    private final Answer[] ANSWERS_1_LEVEL_5 =  {
            new Answer("Adnan Khashoggi", "a", false),
            new Answer("Ronald Regan", "b", false),
            new Answer("Aristotel Onassis", "c", true),
            new Answer("Rupert Murdoch", "d", false),
    };
    private final Answer[] ANSWERS_2_LEVEL_5 =  {
            new Answer("Anglia", "a", false),
            new Answer("Scoția", "b", false),
            new Answer("Irlanda de Nord", "c", true),
            new Answer("Țara Galilor", "d", false),
    };
    private final Answer[] ANSWERS_3_LEVEL_5 =  {
            new Answer("germană", "a", false),
            new Answer("norvegiană", "b", false),
            new Answer("franceză", "c", true),
            new Answer("Daneză", "d", false),
    };
    private final Answer[] ANSWERS_4_LEVEL_5 =  {
            new Answer("Turtă scurtă", "a", false),
            new Answer("Joc de pavaj", "b", false),
            new Answer("Floare de grădină", "c", false),
            new Answer("Toffee fragil", "d", true),
    };

    private final Question[] LEVEL_1 = {
            new Question("Prefixul „eco” vine de la un cuvânt grecesc care înseamnă:", ANSWERS_1_LEVEL_1, 1, 100),
            new Question("Pe drapelul cărei ţări stă scrie motto-ul „Ordine şi progres”", ANSWERS_2_LEVEL_1, 1, 100),
            new Question("Care dintre următoarele soiuri de struguri este folosit pentru a produce un celebru vin roşu?", ANSWERS_3_LEVEL_1, 1, 100),
            new Question("Muammar Gaddafi a fost conducătorul cărei ţări între 1969 şi 2011?", ANSWERS_4_LEVEL_1, 1, 100),
    };
    private final Question[] LEVEL_2 = {
            new Question("Cu ce parte a unui computer este asociat brand-ul „Intel Inside”", ANSWERS_1_LEVEL_2, 1, 100),
            new Question("Care dintre următoarele oraşe este capitala Arabiei Saudite?", ANSWERS_2_LEVEL_2, 1, 100),
            new Question("Sub ce nume a rămas cunoscut eroul naţional al Spaniei, Rodrigo Diaz de Bivar?", ANSWERS_3_LEVEL_2, 1, 100),
            new Question("În ce judeţ se află localitatea Roşia Montană??", ANSWERS_4_LEVEL_2, 1, 100),
    };
    private final Question[] LEVEL_3 = {
            new Question("Care dintre următoarele variante denumeşte un bici alcătuit din mai multe curele împletite?", ANSWERS_1_LEVEL_3, 1, 100),
            new Question("Cum se numeşte pretinsa ştiinţă de a ghici viitorul după conformaţia norilor?", ANSWERS_2_LEVEL_3, 1, 100),
            new Question("Baronul Haussman este cel mai bine cunoscut pentru planificarea oricărui oraș?", ANSWERS_3_LEVEL_3, 1, 100),
            new Question("Ce tip de îmbrăcăminte este Anthony Eden?", ANSWERS_4_LEVEL_3, 1, 100),
    };
    private final Question[] LEVEL_4 = {
            new Question("Ambasadorii din Galeria Națională este un tablou de care artist?", ANSWERS_1_LEVEL_4, 1, 100),
            new Question("Gentleman v Players a fost un meci anual între amatori și profesioniști din care sport?", ANSWERS_2_LEVEL_4, 1, 100),
            new Question("Cine a avut un album de succes în Marea Britanie cu „Born To Do It”, lansat în 2000?", ANSWERS_3_LEVEL_4, 1, 100),
            new Question("Emmanthal este o brânză din ce țară?", ANSWERS_4_LEVEL_4, 1, 100),
    };
    private final Question[] LEVEL_5 = {
            new Question("Cine a fost al doilea soț al lui Jacqueline Kennedy?", ANSWERS_1_LEVEL_5, 1, 100),
            new Question("Râul Foyle se găsește în ce parte a Regatului Unit?", ANSWERS_2_LEVEL_5, 1, 100),
            new Question("Normanii, care au invadat și cucerit Anglia în 1066, care vorbeau limba?", ANSWERS_3_LEVEL_5, 1, 100),
            new Question("Ce este butterscotch?", ANSWERS_4_LEVEL_5, 1, 100),
    };

    private Question getRandomQuestion(Question[] question) {
        return question[new Random().nextInt(question.length)];
    }

    public Question getQuestionByLevel(int level) {
        return switch (level) {
            case 2 -> getRandomQuestion(LEVEL_2);
            case 3 -> getRandomQuestion(LEVEL_3);
            case 4 -> getRandomQuestion(LEVEL_4);
            case 5 -> getRandomQuestion(LEVEL_5);
            default -> getRandomQuestion(LEVEL_1);
        };
    }

    public boolean verifyAnswer(Question question, String answer) {
        return answer.equalsIgnoreCase(question.getCorrectAnswer(question.getAnswers()).getAnswerOption());
    }

    public void printLevel(Question question, int currentLevel) {
        Answer[] answers = question.getAnswers();
        System.out.println();
        System.out.println("● Nivelul " + currentLevel);
        System.out.println("⋙ " + question.getQuestion());
        for (Answer answer : answers) {
            System.out.println("    " + answer.getAnswerOption() + ": " + answer.getAnswer());
        }
    }
}
