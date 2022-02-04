package Lesson5Homework;
import java.util.Scanner;


public class InputRectangle {
    public static void main(String[] args) {

        double FIRST_RECTANGLE_AREA, SECOND_RECTANGLE_AREA;

        Scanner FIRST_RECTANGLE = new Scanner(System.in);
        double[] FIRST_RECTANGLE_VALUES = new double[2];


        System.out.println("Enter width and height for the first rectangle: ");
        for (int i = 0; i < FIRST_RECTANGLE_VALUES.length; i ++) {
            FIRST_RECTANGLE_VALUES[i] = FIRST_RECTANGLE.nextInt();
        }

        Scanner SECOND_RECTANGLE = new Scanner(System.in);
        double[] SECOND_RECTANGLE_VALUES = new double[2];

        System.out.println("Enter width and height for the second rectangle: ");
        for (int i = 0; i < SECOND_RECTANGLE_VALUES.length; i ++) {
            SECOND_RECTANGLE_VALUES[i] = SECOND_RECTANGLE.nextInt();
        }


        FIRST_RECTANGLE.close();
        SECOND_RECTANGLE.close();


        double FIRST_RECTANGLE_WIDTH = FIRST_RECTANGLE_VALUES[0];
        double FIRST_RECTANGLE_HEIGHT = FIRST_RECTANGLE_VALUES[1];
        double SECOND_RECTANGLE_WIDTH = SECOND_RECTANGLE_VALUES[0];
        double SECOND_RECTANGLE_HEIGHT = SECOND_RECTANGLE_VALUES[1];

        System.out.println(FIRST_RECTANGLE_WIDTH + " width, " + FIRST_RECTANGLE_HEIGHT + " height, " + " - First rectangle");
        System.out.println(SECOND_RECTANGLE_WIDTH+ " width, " + SECOND_RECTANGLE_HEIGHT + " height, " + " - Second rectangle");

        FIRST_RECTANGLE_AREA = FIRST_RECTANGLE_WIDTH * FIRST_RECTANGLE_HEIGHT;
        SECOND_RECTANGLE_AREA = SECOND_RECTANGLE_WIDTH * SECOND_RECTANGLE_HEIGHT;


        if (FIRST_RECTANGLE_AREA > SECOND_RECTANGLE_AREA) {
            System.out.println("First rectangle area is greater then the second");
        } else if (FIRST_RECTANGLE_AREA < SECOND_RECTANGLE_AREA) {
            System.out.println("Second rectangle area is greater then the first");
        } else {
            System.out.println("Areas of two rectangles are equal");
        }


    }
}
