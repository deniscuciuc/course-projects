package lesson5homework;
import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter your number");

        int number = inputNumber.nextInt();
        inputNumber.close();

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }


    }
}
