package Lesson5Homework;
import java.util.Scanner;

public class InputNumberCheck {
    public static void main(String[] args) {

        Scanner INPUT_NUMBER = new Scanner(System.in);
        System.out.println("Enter your number");

        int number = INPUT_NUMBER.nextInt();
        INPUT_NUMBER.close();

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }


    }
}
