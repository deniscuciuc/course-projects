package Lesson6Homework;
import java.util.Scanner;

public class SwitchTernary {
    public static void main (String[] args) {
        Scanner colorCodeObj = new Scanner (System.in);
        System.out.println ("Please type here the color code (101,102 or 103 avaible): ");

        int colorCode = colorCodeObj.nextInt();
        colorCodeObj.close();

        String color = colorCode == 100 ? "Yellow" : colorCode == 101 ? "Green" : colorCode == 102 ? "Red" : "Invalid";

        if (colorCode != 100 && colorCode != 101 && colorCode != 102) {
            System.out.println("You have selected " + color + " color! Please enter a valid code!");
        } else {
            System.out.println("You have selected: " + color);
        }

    }
}
