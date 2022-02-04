package Lesson5Homework;
import java.util.Scanner;


public class InputOddEven {
    public static void main(String[] args) {
        float number;

        Scanner INPUT_FLOAT = new Scanner(System.in);
        System.out.println("Enter a floating-point number here: ");

        number = INPUT_FLOAT.nextFloat();
        INPUT_FLOAT.close();

        if (number == 0) {
            System.out.println("zero");
        } else if (number >= 1) {
            System.out.print("positive ");
            if (number > 1_000_000) {
                System.out.print("large");
            }
        } else if (number <= 1) {
            System.out.print("small ");
            if (number < 0) {
                System.out.print("negative");
            }
        } else {
            System.out.println("Non expected number");
        }
    }
}
