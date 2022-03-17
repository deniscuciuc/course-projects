package lesson17homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userChoice = 0;
        System.out.println("\033[01mLesson 17 Homework Menu: \033[0m");
        System.out.println("1.Write a Java program to compare a given string to another string, ignoring case considerations.");
        System.out.println("2.Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is.");
        System.out.println("3.Write a program to reverse a String.");
        System.out.println("4.Write a program that will count the number of words in String.");
        System.out.println("5.Exit");


        Scanner userChoiceObj = new Scanner(System.in);
        do {
            System.out.println("Select task: ");
            userChoice = userChoiceObj.nextInt();
            if (userChoice <= 0 || userChoice > 5) {
                System.out.println("\033[01mInvalid option!\033[0m");
                System.out.println("Please, select existing option...");
            } else {
                switch (userChoice) {
                    case 1:
                        System.out.println("\033[01mExecuting task 1...\033[0m");
                        CompareString.displayStringsResult();
                        break;
                    case 2:
                        System.out.println("\033[01mExecuting task 2...\033[0m");
                        FullNameAbbreviation.displayFullNameAbbreviation();
                        break;
                    case 3:
                        System.out.println("\033[01mExecuting task 3...\033[0m");
                        ReverseString.reverseStringByLooping();
                        ReverseString.reverseStringByReverseMethod();
                        break;
                    case 4:
                        System.out.println("\033[01mExecuting task 4...\033[0m");
                        WordsCounterInString.wordCounter("Hello Java World");
                        WordsCounterInString.wordCounter("Tekwill Academy este un program de formare a specialiștilor în domeniul IT și ghidare în carieră.");
                        break;
                    case 5:
                        System.out.println("\033[01mExiting from the program...\033[0m");
                        break;
                }
            }
        } while (userChoice != 5);
        userChoiceObj.close();
    }
}
