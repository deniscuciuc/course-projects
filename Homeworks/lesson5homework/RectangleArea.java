package lesson5homework;
import java.util.Scanner;


public class RectangleArea {
    public static void main(String[] args) {

        double firstRectangleArea, secondRectangleArea;

        Scanner firstRectangle = new Scanner(System.in);
        double[] firstRectangleValues = new double[2];


        System.out.println("Enter width and height for the first rectangle: ");
        for (int i = 0; i < firstRectangleValues.length; i ++) {
            firstRectangleValues[i] = firstRectangle.nextInt();
        }

        Scanner secondRectangle = new Scanner(System.in);
        double[] secondRectangleValues = new double[2];

        System.out.println("Enter width and height for the second rectangle: ");
        for (int i = 0; i < secondRectangleValues.length; i ++) {
            secondRectangleValues[i] = secondRectangle.nextInt();
        }

        firstRectangle.close();
        secondRectangle.close();


        firstRectangleArea = firstRectangleValues[0] * firstRectangleValues[1];
        secondRectangleArea = secondRectangleValues[0] * secondRectangleValues[1];

        if (firstRectangleArea > secondRectangleArea) {
            System.out.println("First rectangle area is greater then the second");
        } else if (firstRectangleArea < secondRectangleArea) {
            System.out.println("Second rectangle area is greater then the first");
        } else {
            System.out.println("Areas of two rectangles are equal");
        }


    }
}
