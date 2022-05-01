package com.example.whowantstobemillionaire.levels;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Stream;

public class QuestionsAndAnswers {
    private final Answer[] ANSWERS_1_LEVEL_1 =  {
            new Answer("stat", AnswerOptions.A, false),
            new Answer("casa", AnswerOptions.B, true),
            new Answer("soare", AnswerOptions.C, false),
            new Answer("viata", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_2_LEVEL_1 =  {
            new Answer("Australia", AnswerOptions.A, false),
            new Answer("Brazilia", AnswerOptions.B, true),
            new Answer("Africa de Sud", AnswerOptions.C, false),
            new Answer("Indonezia", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_3_LEVEL_1 =  {
            new Answer("Pinot Grigio", AnswerOptions.A, false),
            new Answer("Riesling", AnswerOptions.B, false),
            new Answer("Cabernet Sauvignon", AnswerOptions.C, true),
            new Answer("Chardonnay", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_4_LEVEL_1 =  {
            new Answer("Libia", AnswerOptions.A, true),
            new Answer("Tunisia", AnswerOptions.B, false),
            new Answer("Sudan", AnswerOptions.C, false),
            new Answer("Egipt", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_1_LEVEL_2 =  {
            new Answer("BIOS", AnswerOptions.A, false),
            new Answer("RAM", AnswerOptions.B, false),
            new Answer("USB", AnswerOptions.C, false),
            new Answer("Procesorul", AnswerOptions.D, true),
    };
    private final Answer[] ANSWERS_2_LEVEL_2 =  {
            new Answer("Abu Dhabi", AnswerOptions.A, false),
            new Answer("Manama", AnswerOptions.B, false),
            new Answer("Doha", AnswerOptions.C, false),
            new Answer("Ryadh", AnswerOptions.D, true),
    };
    private final Answer[] ANSWERS_3_LEVEL_2 =  {
            new Answer("El Cano", AnswerOptions.A, false),
            new Answer("El Greco", AnswerOptions.B, false),
            new Answer("El Cid", AnswerOptions.C, true),
            new Answer("El Salvador", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_4_LEVEL_2 =  {
            new Answer("Prahova", AnswerOptions.A, false),
            new Answer("Alba", AnswerOptions.B, true),
            new Answer("Buzău", AnswerOptions.C, false),
            new Answer("Maramureş", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_1_LEVEL_3 =  {
            new Answer("gârbaci", AnswerOptions.A, true),
            new Answer("gârliţă", AnswerOptions.B, false),
            new Answer("gâză", AnswerOptions.C, false),
            new Answer("gârniţă", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_2_LEVEL_3 =  {
            new Answer("giromanţie", AnswerOptions.A, false),
            new Answer("acromanţie", AnswerOptions.B, true),
            new Answer("meteoromanţie", AnswerOptions.C, false),
            new Answer("nefelomanţie", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_3_LEVEL_3 =  {
            new Answer("Roma", AnswerOptions.A, false),
            new Answer("Paris", AnswerOptions.B, true),
            new Answer("Berlin", AnswerOptions.C, false),
            new Answer("Atena", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_4_LEVEL_3 =  {
            new Answer("Palton", AnswerOptions.A, false),
            new Answer("Pălărie", AnswerOptions.B, true),
            new Answer("Pantof", AnswerOptions.C, false),
            new Answer("Cravată", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_1_LEVEL_4 =  {
            new Answer("Van Eyck", AnswerOptions.A, false),
            new Answer("Holbein", AnswerOptions.B, true),
            new Answer("Mihailangelo", AnswerOptions.C, false),
            new Answer("Rembrandt", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_2_LEVEL_4 =  {
            new Answer("Tenis pe gazon", AnswerOptions.A, false),
            new Answer("Uniunea de rugby", AnswerOptions.B, false),
            new Answer("Polo", AnswerOptions.C, false),
            new Answer("Cricket", AnswerOptions.D, true),
    };
    private final Answer[] ANSWERS_3_LEVEL_4 =  {
            new Answer("Coldplay", AnswerOptions.A, false),
            new Answer("Toploader", AnswerOptions.B, false),
            new Answer("A1", AnswerOptions.C, false),
            new Answer("Craig David", AnswerOptions.D, true),
    };
    private final Answer[] ANSWERS_4_LEVEL_4 =  {
            new Answer("Franța", AnswerOptions.A, false),
            new Answer("Italia", AnswerOptions.B, false),
            new Answer("Olanda", AnswerOptions.C, false),
            new Answer("Elveția", AnswerOptions.D, true),
    };
    private final Answer[] ANSWERS_1_LEVEL_5 =  {
            new Answer("Adnan Khashoggi", AnswerOptions.A, false),
            new Answer("Ronald Regan", AnswerOptions.B, false),
            new Answer("Aristotel Onassis", AnswerOptions.C, true),
            new Answer("Rupert Murdoch", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_2_LEVEL_5 =  {
            new Answer("Anglia", AnswerOptions.A, false),
            new Answer("Scoția", AnswerOptions.B, false),
            new Answer("Irlanda de Nord", AnswerOptions.C, true),
            new Answer("Țara Galilor", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_3_LEVEL_5 =  {
            new Answer("germană", AnswerOptions.A, false),
            new Answer("norvegiană", AnswerOptions.B, false),
            new Answer("franceză", AnswerOptions.C, true),
            new Answer("Daneză", AnswerOptions.D, false),
    };
    private final Answer[] ANSWERS_4_LEVEL_5 =  {
            new Answer("Turtă scurtă", AnswerOptions.A, false),
            new Answer("Joc de pavaj", AnswerOptions.B, false),
            new Answer("Floare de grădină", AnswerOptions.C, false),
            new Answer("Toffee fragil", AnswerOptions.D, true),
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
        return answer.equalsIgnoreCase(question.getCorrectAnswer(question.getAnswers()).getAnswerOption().toString());
    }

    public void printLevel(Question question, int currentLevel) {
        Answer[] answers = question.getAnswers();
        Stream<Answer> answerStreamObj = Arrays.stream(answers);
        System.out.println();
        System.out.println("● Nivelul " + currentLevel);
        System.out.println("⋙ " + question.getQuestion());
        answerStreamObj.forEach(answer -> System.out.println("    " + answer.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answer.getAnswer()));
        System.out.println();
        System.out.println("----- Ajutor ------");
        System.out.println("F - 50/50 | P - Suna un prieten | A - Intreaba publicul");
        System.out.println();
    }
}
