package external.practice.W3Resource.BasicPart1;
import static java.lang.Math.pow;
import java.util.Scanner;

public class From9to20 {
    public static void main (String[] args) {
        task9();
        task10();
        task11();
        task12();
        task13();
    }




/*
*   Task 9:
*   Write a Java program to compute the specified expressions and print the output. Go to the editor
*   Test Data:
*   ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
*   Expected Output
*   2.138888888888889
 */
    static void task9() {
        System.out.println("Task 9: ");

        double x = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(x);
    }


/*
*   Task 10:
*   Write a Java program to compute a specified formula.
*   Specified Formula :
*   4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
*   Expected Output
*   2.9760461760461765
*/
    static void task10() {
        System.out.println("Task 10: ");

        double x = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(x);
    }


/*
*   Task 11:
*   Write a Java program to print the area and perimeter of a circle.
*   Test Data:
*   Radius = 7.5
*   Expected Output
*   Perimeter is = 47.12388980384689
*   Area is = 176.71458676442586
 */
    static void task11() {
        System.out.println("Task 11: ");

        double radius = 7.5,
                pi = Math.PI,
                area = pi * pow(radius, 2),
                perimeter = 2 * pi * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println ("Area is = " + area);

    }


/*
*   Task 12:
*   Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/
    static void task12() {
        System.out.println("Task 12: ");

        Scanner inputNumbers = new Scanner(System.in);
        double[] userNumbers = new double[3];

        System.out.println("Type here three numbers to take average: ");
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = inputNumbers.nextDouble();
        }
        inputNumbers.close();

        double average = (userNumbers[0] * userNumbers[1] * userNumbers[2]) / userNumbers.length;
        System.out.println("Average number is: " + average);
    }


/*
*    Task 13:
*   Write a Java program to print the area and perimeter of a rectangle. Go to the editor
*   Test Data:
*   Width = 5.5 Height = 8.5
*   Expected Output
*   Area is 5.6 * 8.5 = 47.60
*   Perimeter is 2 * (5.6 + 8.5) = 28.20
*/
    static void task13() {
        System.out.println("Task 12: ");

        double width = 5.5, height = 8.5, area = width * height, perimeter = 2 * (width + height);
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ")" + " = " + perimeter);
    }

    static void task14() {

    }
}
