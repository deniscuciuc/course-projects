package lesson10homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userChoice = 0;
        System.out.println("\033[01mLesson 10 Homework Menu: \033[0m");
        System.out.println("1.First task: Enum that store moths of a calendaristic year");
        System.out.println("2.Second task: Check day if it's holiday or business day");
        System.out.println("3.Third task: Convert string values to data types");
        System.out.println("4.Exit");


        Scanner userChoiceObj = new Scanner(System.in);
        do {
            System.out.println("Select option: ");
            userChoice = userChoiceObj.nextInt();
            if (userChoice <= 0 || userChoice > 4) {
                System.out.println("\033[01mInvalid option!\033[0m");
                System.out.println("Please, select existing option...");
            } else {
                switch (userChoice) {
                    case 1: // done
                        System.out.println("\033[01mExecuting first task...\033[0m");
                        StoreMonths.storeMonths();
                        break;
                    case 2:
                        System.out.println("\033[01mExecuting second task...\033[0m");
                        CheckDay.checkDay();
                        break;
                    case 3:
                        System.out.println("\033[01mExecuting third task...\033[0m");
                        StringConverter.stringConverter();
                        break;
                    case 4:
                        System.out.println("\033[01mExiting from the program...\033[0m");
                        break;
                }
            }
        } while (userChoice != 4);
        userChoiceObj.close();
    }
}
