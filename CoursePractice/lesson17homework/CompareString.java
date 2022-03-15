package lesson17homework;

public class CompareString {
    private final static String string1 = "Hello Java World";
    private final static String string2 = "HELLO java WORLD";
    private final static String string3 = "Stephen Edwin King";

    static boolean compareString1AndString2() {
        return string1.equalsIgnoreCase(string2);
    }

    static boolean compareString2AndString3() {
        return string2.equalsIgnoreCase(string3);
    }

    static void displayStringsResult() {
        System.out.println("\"" + string1 + "\" equals \"" + string2 + "\"? " + compareString1AndString2());
        System.out.println("\"" + string2 + "\" equals \"" + string3 + "\"? " + compareString2AndString3());
    }
}
