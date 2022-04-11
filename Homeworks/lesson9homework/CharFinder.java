package lesson9homework;

import java.util.Scanner;


public class CharFinder {
    public static void main (String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("\033[01mEnter String: \033[0m");
        String userString = stringScanner.nextLine();
        stringScanner.close();

        char[] userStringToChar = userString.toCharArray();

        int charCount = 0;
        for (char c : userStringToChar) {
            if (c == 'a') {
                charCount++;
            }
        }

        System.out.println("\033[01mOutput: \033[0m");
        System.out.println("Number of a's: " + charCount);
    }
}
