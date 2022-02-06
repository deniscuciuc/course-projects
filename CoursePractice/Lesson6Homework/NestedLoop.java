package Lesson6Homework;
import java.util.Scanner;

public class NestedLoop {
    public static void main (String[] args) {
        final double maxTemp = 60,
                     minTemp = 15;

        Scanner inputTemp = new Scanner (System.in);
        System.out.println("Enter the temperature of your porridge:");

        float temperature = inputTemp.nextFloat();
        inputTemp.close();


        if(temperature > maxTemp) {
            System.out.println("Porridge is too hot.");
        } else if (temperature < minTemp) {
            System.out.println("Porridge is too cold.");
        } else if (temperature >= minTemp && temperature <= maxTemp) {
            System.out.println("Porridge is just right.");
        }

    }
}
