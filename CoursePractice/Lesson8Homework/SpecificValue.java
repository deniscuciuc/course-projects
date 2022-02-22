package Lesson8Homework;
import java.util.Scanner;

public class SpecificValue {
    public static void main (String[] args) {
        Scanner intArrayObj = new Scanner(System.in);
        System.out.println("Type here how many values you want to be in array: ");
        int arrayLength = intArrayObj.nextInt();


        Scanner inputArrayValues = new Scanner(System.in);
        int arrayValues[] = new int[arrayLength];

        System.out.println("Now enter here int values of your array: ");
        for (int i = 0; i < arrayLength; i++) {
            arrayValues[i] = inputArrayValues.nextInt();
        }


        Scanner elementToCheckObj = new Scanner(System.in);
        System.out.println("What int number do you want to check if this exists in your array?");
        int intToCheckInArray = elementToCheckObj.nextInt();

        inputArrayValues.close();
        intArrayObj.close();
        elementToCheckObj.close();

        checkIfExistsOneDimensionalIntArray(arrayValues, intToCheckInArray);

    }

    static boolean checkIfExistsOneDimensionalIntArray (int[] array, int elementToCheck) {
        boolean exists = false;

        for (int i : array) {
            if (i == elementToCheck) {
                exists = true;
                break;
            }
        }
        if (exists == true) {
            System.out.println("In array exist: " + elementToCheck);
        } else {
            System.out.println("In array not exist " + elementToCheck);
        }
        return exists;
    }
}
