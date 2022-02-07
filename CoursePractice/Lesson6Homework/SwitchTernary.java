package Lesson6Homework;

import java.util.Objects;

public class SwitchTernary {
    public static void main (String[] args) {
        int colorCode = 101;
        String color = null;
        colorCode = (Objects.equals (color, "Yellow")) ? 100
                : (Objects.equals (color, "Green")) ? 101
                : (Objects.equals (color, "Red")) ? 102
                : 0;

        System.out.println("Color ---&gt;"+color);

    }
}
