package com.example.whowantstobemillionaire.levels;

import com.example.whowantstobemillionaire.enums.AnswerOptions;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Stream;

public class Levels {
    private static ArrayList<Question> generateLevel1() {
        ArrayList<Answer> ANSWERS_1_LEVEL_1 = new ArrayList<>();
        ANSWERS_1_LEVEL_1.add(new Answer("stat", AnswerOptions.A, false));
        ANSWERS_1_LEVEL_1.add(new Answer("casa", AnswerOptions.B, true));
        ANSWERS_1_LEVEL_1.add(new Answer("soare", AnswerOptions.C, false));
        ANSWERS_1_LEVEL_1.add(new Answer("viata", AnswerOptions.D, false));
        ArrayList<Answer> ANSWERS_2_LEVEL_1 = new ArrayList<>();
        ANSWERS_2_LEVEL_1.add(new Answer("Australia", AnswerOptions.A, false));
        ANSWERS_2_LEVEL_1.add(new Answer("Brazilia", AnswerOptions.B, true));
        ANSWERS_2_LEVEL_1.add(new Answer("Africa de Sud", AnswerOptions.C, false));
        ANSWERS_2_LEVEL_1.add(new Answer("Indonezia", AnswerOptions.D, false));
        ArrayList<Answer> ANSWERS_3_LEVEL_1 = new ArrayList<>();
        ANSWERS_3_LEVEL_1.add(new Answer("Pinot Grigio", AnswerOptions.A, false));
        ANSWERS_3_LEVEL_1.add(new Answer("Riesling", AnswerOptions.B, false));
        ANSWERS_3_LEVEL_1.add(new Answer("Cabernet Sauvignon", AnswerOptions.C, true));
        ANSWERS_3_LEVEL_1.add(new Answer("Chardonnay", AnswerOptions.D, false));
        ArrayList<Answer> ANSWERS_4_LEVEL_1 = new ArrayList<>();
        ANSWERS_4_LEVEL_1.add(new Answer("Libia", AnswerOptions.A, true));
        ANSWERS_4_LEVEL_1.add(new Answer("Tunisia", AnswerOptions.B, false));
        ANSWERS_4_LEVEL_1.add(new Answer("Sudan", AnswerOptions.C, false));
        ANSWERS_4_LEVEL_1.add(new Answer("Egipt", AnswerOptions.D, false));
        ArrayList<Question> LEVEL_1 = new ArrayList<>();
        LEVEL_1.add(new Question("Prefixul „eco” vine de la un cuvânt grecesc care înseamnă:", ANSWERS_1_LEVEL_1, 1, 100));
        LEVEL_1.add(new Question("Pe drapelul cărei ţări stă scrie motto-ul „Ordine şi progres”", ANSWERS_2_LEVEL_1, 1, 100));
        LEVEL_1.add(new Question("Care dintre următoarele soiuri de struguri este folosit pentru a produce un celebru vin roşu?", ANSWERS_3_LEVEL_1, 1, 100));
        LEVEL_1.add(new Question("Muammar Gaddafi a fost conducătorul cărei ţări între 1969 şi 2011?", ANSWERS_4_LEVEL_1, 1, 100));
        return LEVEL_1;
    }

    private static ArrayList<Question> generateLevel2() {
        ArrayList<Answer> ANSWERS_1_LEVEL_2 = new ArrayList<>();
        ANSWERS_1_LEVEL_2.add(new Answer("BIOS", AnswerOptions.A, false));
        ANSWERS_1_LEVEL_2.add(new Answer("RAM", AnswerOptions.B, false));
        ANSWERS_1_LEVEL_2.add(new Answer("USB", AnswerOptions.C, false));
        ANSWERS_1_LEVEL_2.add(new Answer("Procesorul", AnswerOptions.D, true));
        ArrayList<Answer> ANSWERS_2_LEVEL_2 = new ArrayList<>();
        ANSWERS_2_LEVEL_2.add(new Answer("Abu Dhabi", AnswerOptions.A, false));
        ANSWERS_2_LEVEL_2.add(new Answer("Manama", AnswerOptions.B, false));
        ANSWERS_2_LEVEL_2.add(new Answer("Doha", AnswerOptions.C, false));
        ANSWERS_2_LEVEL_2.add(new Answer("Ryadh", AnswerOptions.D, true));
        ArrayList<Answer> ANSWERS_3_LEVEL_2 = new ArrayList<>();
        ANSWERS_3_LEVEL_2.add(new Answer("El Cano", AnswerOptions.A, false));
        ANSWERS_3_LEVEL_2.add(new Answer("El Greco", AnswerOptions.B, false));
        ANSWERS_3_LEVEL_2.add(new Answer("El Cid", AnswerOptions.C, true));
        ANSWERS_3_LEVEL_2.add(new Answer("El Salvador", AnswerOptions.D, false));
        ArrayList<Answer> ANSWERS_4_LEVEL_2 = new ArrayList<>();
        ANSWERS_4_LEVEL_2.add(new Answer("Prahova", AnswerOptions.A, false));
        ANSWERS_4_LEVEL_2.add(new Answer("Alba", AnswerOptions.B, true));
        ANSWERS_4_LEVEL_2.add(new Answer("Buzău", AnswerOptions.C, false));
        ANSWERS_4_LEVEL_2.add(new Answer("Maramureş", AnswerOptions.D, false));
        ArrayList<Question> LEVEL_2 = new ArrayList<>();
        LEVEL_2.add(new Question("Cu ce parte a unui computer este asociat brand-ul „Intel Inside”", ANSWERS_1_LEVEL_2, 2, 100));
        LEVEL_2.add(new Question("Care dintre următoarele oraşe este capitala Arabiei Saudite?", ANSWERS_2_LEVEL_2, 2, 100));
        LEVEL_2.add(new Question("Sub ce nume a rămas cunoscut eroul naţional al Spaniei, Rodrigo Diaz de Bivar?", ANSWERS_3_LEVEL_2, 2, 100));
        LEVEL_2.add(new Question("În ce judeţ se află localitatea Roşia Montană??", ANSWERS_4_LEVEL_2, 2, 100));
        return LEVEL_2;
    }


    private static ArrayList<Question> generateLevel3() {
        ArrayList<Answer> ANSWERS_1_LEVEL_3 = new ArrayList<>();
        ANSWERS_1_LEVEL_3.add(new Answer("gârbaci", AnswerOptions.A, true));
        ANSWERS_1_LEVEL_3.add(new Answer("gârliţă", AnswerOptions.B, false));
        ANSWERS_1_LEVEL_3.add(new Answer("gâză", AnswerOptions.C, false));
        ANSWERS_1_LEVEL_3.add(new Answer("gârniţă", AnswerOptions.D, false));
        ArrayList<Answer> ANSWERS_2_LEVEL_3 = new ArrayList<>();
        ANSWERS_2_LEVEL_3.add(new Answer("giromanţie", AnswerOptions.A, false));
        ANSWERS_2_LEVEL_3.add(new Answer("acromanţie", AnswerOptions.B, true));
        ANSWERS_2_LEVEL_3.add(new Answer("meteoromanţie", AnswerOptions.C, false));
        ANSWERS_2_LEVEL_3.add(new Answer("nefelomanţie", AnswerOptions.D, false));
        ArrayList<Answer> ANSWERS_3_LEVEL_3 = new ArrayList<>();
        ANSWERS_3_LEVEL_3.add(new Answer("Roma", AnswerOptions.A, false));
        ANSWERS_3_LEVEL_3.add(new Answer("Paris", AnswerOptions.B, true));
        ANSWERS_3_LEVEL_3.add(new Answer("Berlin", AnswerOptions.C, false));
        ANSWERS_3_LEVEL_3.add(new Answer("Atena", AnswerOptions.D, false));
        ArrayList<Answer> ANSWERS_4_LEVEL_3 = new ArrayList<>();
        ANSWERS_4_LEVEL_3.add(new Answer("Palton", AnswerOptions.A, false));
        ANSWERS_4_LEVEL_3.add(new Answer("Pălărie", AnswerOptions.B, true));
        ANSWERS_4_LEVEL_3.add(new Answer("Pantof", AnswerOptions.C, false));
        ANSWERS_4_LEVEL_3.add(new Answer("Cravată", AnswerOptions.D, false));
        ArrayList<Question> LEVEL_3 = new ArrayList<>();
        LEVEL_3.add(new Question("Care dintre următoarele variante denumeşte un bici alcătuit din mai multe curele împletite?", ANSWERS_1_LEVEL_3, 3, 100));
        LEVEL_3.add(new Question("Cum se numeşte pretinsa ştiinţă de a ghici viitorul după conformaţia norilor?", ANSWERS_2_LEVEL_3, 3, 100));
        LEVEL_3.add(new Question("Baronul Haussman este cel mai bine cunoscut pentru planificarea oricărui oraș?", ANSWERS_3_LEVEL_3, 3, 100));
        LEVEL_3.add(new Question("Ce tip de îmbrăcăminte este Anthony Eden?", ANSWERS_4_LEVEL_3, 3, 100));
        return LEVEL_3;
    }

    private static ArrayList<Question> generateLevel4() {
        ArrayList<Answer> ANSWERS_1_LEVEL_4 = new ArrayList<>();
        ANSWERS_1_LEVEL_4.add(new Answer("Van Eyck", AnswerOptions.A, false));
        ANSWERS_1_LEVEL_4.add(new Answer("Holbein", AnswerOptions.B, true));
        ANSWERS_1_LEVEL_4.add(new Answer("Mihailangelo", AnswerOptions.C, false));
        ANSWERS_1_LEVEL_4.add(new Answer("Rembrandt", AnswerOptions.D, false));
        ArrayList<Answer> ANSWERS_2_LEVEL_4 = new ArrayList<>();
        ANSWERS_2_LEVEL_4.add(new Answer("Tenis pe gazon", AnswerOptions.A, false));
        ANSWERS_2_LEVEL_4.add(new Answer("Uniunea de rugby", AnswerOptions.B, false));
        ANSWERS_2_LEVEL_4.add(new Answer("Polo", AnswerOptions.C, false));
        ANSWERS_2_LEVEL_4.add(new Answer("Cricket", AnswerOptions.D, true));
        ArrayList<Answer> ANSWERS_3_LEVEL_4 = new ArrayList<>();
        ANSWERS_3_LEVEL_4.add(new Answer("Coldplay", AnswerOptions.A, false));
        ANSWERS_3_LEVEL_4.add(new Answer("Toploader", AnswerOptions.B, false));
        ANSWERS_3_LEVEL_4.add(new Answer("A1", AnswerOptions.C, false));
        ANSWERS_3_LEVEL_4.add(new Answer("Craig David", AnswerOptions.D, true));
        ArrayList<Answer> ANSWERS_4_LEVEL_4 = new ArrayList<>();
        ANSWERS_4_LEVEL_4.add(new Answer("Franța", AnswerOptions.A, false));
        ANSWERS_4_LEVEL_4.add(new Answer("Italia", AnswerOptions.B, false));
        ANSWERS_4_LEVEL_4.add(new Answer("Olanda", AnswerOptions.C, false));
        ANSWERS_4_LEVEL_4.add(new Answer("Elveția", AnswerOptions.D, true));
        ArrayList<Question> LEVEL_4 = new ArrayList<>();
        LEVEL_4.add(new Question("Ambasadorii din Galeria Națională este un tablou de care artist?", ANSWERS_1_LEVEL_4, 4, 100));
        LEVEL_4.add(new Question("Gentleman v Players a fost un meci anual între amatori și profesioniști din care sport?", ANSWERS_2_LEVEL_4, 4, 100));
        LEVEL_4.add(new Question("Cine a avut un album de succes în Marea Britanie cu „Born To Do It”, lansat în 2000?", ANSWERS_3_LEVEL_4, 4, 100));
        LEVEL_4.add(new Question("Emmanthal este o brânză din ce țară?", ANSWERS_4_LEVEL_4, 4, 100));
        return LEVEL_4;
    }

    private static ArrayList<Question> generateLevel5() {
        ArrayList<Answer> ANSWERS_1_LEVEL_5 = new ArrayList<>();
        ANSWERS_1_LEVEL_5.add(new Answer("Van Eyck", AnswerOptions.A, false));
        ANSWERS_1_LEVEL_5.add(new Answer("Holbein", AnswerOptions.B, true));
        ANSWERS_1_LEVEL_5.add(new Answer("Mihailangelo", AnswerOptions.C, false));
        ANSWERS_1_LEVEL_5.add(new Answer("Rembrandt", AnswerOptions.D, false));
        ArrayList<Answer> ANSWERS_2_LEVEL_5 = new ArrayList<>();
        ANSWERS_2_LEVEL_5.add(new Answer("Tenis pe gazon", AnswerOptions.A, false));
        ANSWERS_2_LEVEL_5.add(new Answer("Uniunea de rugby", AnswerOptions.B, false));
        ANSWERS_2_LEVEL_5.add(new Answer("Polo", AnswerOptions.C, false));
        ANSWERS_2_LEVEL_5.add(new Answer("Cricket", AnswerOptions.D, true));
        ArrayList<Answer> ANSWERS_3_LEVEL_5 = new ArrayList<>();
        ANSWERS_3_LEVEL_5.add(new Answer("Coldplay", AnswerOptions.A, false));
        ANSWERS_3_LEVEL_5.add(new Answer("Toploader", AnswerOptions.B, false));
        ANSWERS_3_LEVEL_5.add(new Answer("A1", AnswerOptions.C, false));
        ANSWERS_3_LEVEL_5.add(new Answer("Craig David", AnswerOptions.D, true));
        ArrayList<Answer> ANSWERS_4_LEVEL_5 = new ArrayList<>();
        ANSWERS_4_LEVEL_5.add(new Answer("Franța", AnswerOptions.A, false));
        ANSWERS_4_LEVEL_5.add(new Answer("Italia", AnswerOptions.B, false));
        ANSWERS_4_LEVEL_5.add(new Answer("Olanda", AnswerOptions.C, false));
        ANSWERS_4_LEVEL_5.add(new Answer("Elveția", AnswerOptions.D, true));
        ArrayList<Question> LEVEL_5 = new ArrayList<>();
        LEVEL_5.add(new Question("Ambasadorii din Galeria Națională este un tablou de care artist?", ANSWERS_1_LEVEL_5, 5, 100));
        LEVEL_5.add(new Question("Gentleman v Players a fost un meci anual între amatori și profesioniști din care sport?", ANSWERS_2_LEVEL_5, 5, 100));
        LEVEL_5.add(new Question("Cine a avut un album de succes în Marea Britanie cu „Born To Do It”, lansat în 2000?", ANSWERS_3_LEVEL_5, 5, 100));
        LEVEL_5.add(new Question("Emmanthal este o brânză din ce țară?", ANSWERS_4_LEVEL_5, 5, 100));
        return LEVEL_5;
    }

    private Question getRandomQuestion(ArrayList<Question> questions) {
        return questions.get(new Random().nextInt(questions.size()));
    }

    public Question getQuestionByLevel(int level) {
        return switch (level) {
            case 1 -> getRandomQuestion(generateLevel1());
            case 2 -> getRandomQuestion(generateLevel2());
            case 3 -> getRandomQuestion(generateLevel3());
            case 4 -> getRandomQuestion(generateLevel4());
            case 5 -> getRandomQuestion(generateLevel5());
            default -> null;
        };

    }

    public void printLevel(Question question, int currentLevel) {
        ArrayList<Answer> answers = question.getAnswers();
        Stream<Answer> answerStreamObj = answers.stream();
        System.out.println();
        System.out.println("● Nivelul " + currentLevel);
        System.out.println("⋙ " + question.getQuestion());
        answerStreamObj.forEach(answer -> System.out.println("    " + answer.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answer.getAnswer()));
        System.out.println();
        System.out.println("----- Ajutor ------");
        System.out.println("F - 50/50 | P - Suna un prieten | K - Intreaba publicul");
        System.out.println();
    }
}
