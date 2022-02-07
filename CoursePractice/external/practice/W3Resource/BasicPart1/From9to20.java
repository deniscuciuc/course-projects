package external.practice.W3Resource.BasicPart1;
import static java.lang.Math.pow;
import java.util.Scanner;

public class From9to20 {
    public static void main (String[] args) {
        task9();
        task10();
        task11();
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
        System.out.println (x);
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
}
