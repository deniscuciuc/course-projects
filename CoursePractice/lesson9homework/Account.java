package lesson9homework;

import java.util.Scanner;

public class Account {
    private static final int pinCode = 5563;

    public static int getPinFromUser () {
        int inputPin;
        Scanner userPin = new Scanner(System.in);
        System.out.println("Enter pin code: ");
        inputPin = userPin.nextInt();
        return inputPin;
    }


    public static void main(String[] args) {
        int attemptsCount = 1;
        boolean pinVerify = false;
        System.out.println("\033[01mLogging in to your account...\033[0m");
        while (!pinVerify) {
            if (getPinFromUser() == pinCode) {
                System.out.println("Correct, welcome back.");
                pinVerify = true;
                break;
            } else if (attemptsCount < 3) {
                System.out.println("Incorrect, try again.");
                attemptsCount++;
            } else if (attemptsCount == 3) {
                System.out.println("Sorry but you have been locked out.");
                return;
            }
        }
    }

}
