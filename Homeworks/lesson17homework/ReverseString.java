package lesson17homework;
import java.lang.*;

public class ReverseString {
    public static String stringToReverse = "programming", reversedString = "";
    public static void reverseStringByLooping() {
        char eachCharacter;

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            eachCharacter = stringToReverse.charAt(i);
            reversedString = reversedString + eachCharacter;
        }
        System.out.println(stringToReverse + " -> " + reversedString + "(method by using for loop)");
    }


    public static void reverseStringByReverseMethod() {
        StringBuilder reverseString = new StringBuilder(stringToReverse);
        String reversedString = reverseString.reverse().toString();
        System.out.println(stringToReverse + " -> " + reversedString + "(reverse())");

    }
}
