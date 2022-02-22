package lesson7homework;
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        boolean positive = true;
        int intNumber, digit, reverse = 0;
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");

        do {
            intNumber = inputNumber.nextInt();
            if (intNumber < 0) {
                positive = false;
                System.out.println("Integer can't be negative! Enter a positive integer: ");
            } else {
                positive = true;
            }
        } while (!positive);

        while (intNumber != 0) {
            digit = intNumber % 10;
            reverse = reverse * 10 + digit;
            intNumber /= 10;
        }
        System.out.println("The reverse is: " + reverse);

    }
}
