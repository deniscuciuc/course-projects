package external.methods.Arrays;
import java.util.Scanner;

public class InputUser {
    public static void main (String[] args) {
        inputValuesForOneDimensionalIntArray();
        // inputValuesForTwoDimensionalIntArray();
    }


    static void inputValuesForOneDimensionalIntArray () {
        Scanner intArrayObj = new Scanner(System.in);
        System.out.println("Type here how many values you want to be in array: ");
        int arrayLength = intArrayObj.nextInt();


        Scanner inputArrayValues = new Scanner(System.in);
        int arrayValues[] = new int[arrayLength];

        System.out.println("Now enter here int values of your array: ");
        for (int i = 0; i < arrayLength; i++) {
            arrayValues[i] = inputArrayValues.nextInt();
        }
        inputArrayValues.close();
        intArrayObj.close();

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arrayValues[i] + " ");
        }

    }


    /*static void inputValuesForTwoDimensionalIntArray () {
        Scanner intArrayRows = new Scanner(System.in);
        System.out.println("How many rows do you need in your 2d array?");
        int rows = intArrayRows.nextInt();
        intArrayRows.close();


        Scanner intArrayCols = new Scanner(System.in);
        System.out.println("How many columns do you need in array?");
        int cols = intArrayCols.nextInt();
        intArrayCols.close();


        int inputArray[][] = new int[rows][cols];

        int elements = rows * cols;
        Scanner inputValues = new Scanner(System.in);
        System.out.println("Please enter " + elements + " elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; i++) {
                inputArray[i][j] = inputValues.nextInt();
            }
        }
        inputValues.close();


        // Output
        System.out.println("The input array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(inputArray[i][j] + "\t");
            }
        }
    }*/
}
