package lesson17homework;
import java.lang.String;
public class WordsCounterInString {
    public static void wordCounter(String string) {
        int wordCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                wordCounter++;
            }
        }
        wordCounter++;
        System.out.println("Proposition \"" + string + "\" have " + wordCounter + " words");
    }
}
