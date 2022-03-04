package lesson9homework;
import java.util.Scanner;

public class Area {
    private int rectangleLength, getRectangleWidth;

    public void setDim(int rectangleLength, int getRectangleWidth) {
        this.rectangleLength = rectangleLength;
        this.getRectangleWidth = getRectangleWidth;
    }

    int getArea() {
        return rectangleLength * getRectangleWidth;
    }
}


class areaMain {
    public static void main(String[] args) {
        int length, width, area;
        Area areaValues = new Area();

        Scanner rectangleValues = new Scanner(System.in);
        System.out.println("Enter here length of rectangle: ");
        length = rectangleValues.nextInt();
        System.out.println("Enter now width of rectangle: ");
        width = rectangleValues.nextInt();
        rectangleValues.close();

        areaValues.setDim(length, width);
        area = areaValues.getArea();
        System.out.println("Area of rectangle is: " + area);
    }
}
