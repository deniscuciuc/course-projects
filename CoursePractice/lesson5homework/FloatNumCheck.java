package lesson5homework;
import java.util.Scanner;


public class FloatNumCheck {
    public static void main(String[] args) {
        float number;

        Scanner inputFloat = new Scanner(System.in);
        System.out.println("Enter a floating-point number here: ");

        number = inputFloat.nextFloat();
        inputFloat.close();

        if (number == 0) {
            System.out.println("zero");
        } else if (number >= 1) {
            System.out.print("positive ");
            if (number > 1_000_000) {
                System.out.print("large");
            } else {
                System.out.print("small");
            }
        } else if (number < 0) {
            System.out.print ("negative ");
            if (number <= - 1_000_000) {
                System.out.print ("large ");
            } else {
                System.out.print ("small");
            }
        } else {
            System.out.println("Non expected number");
        }
    }
}
