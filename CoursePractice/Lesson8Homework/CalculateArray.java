package Lesson8Homework;

import java.util.Scanner;

public class CalculateArray {
    public static void main(String[] args) {
        int[] oneDimensionalArray = {5, 6, 7, 1, 12};
        int[][] twoDimensionalArray = {{5, 1, 2, 3}, {1, 4, 12}};

        System.out.println("Here are sum, average number and the number of even and odd elements for 1d array:");
        averageAndSumOfOneDimensionalIntArray(oneDimensionalArray);
        numberOfEvenAndOddNumbersOneDimensionalIntArray(oneDimensionalArray);

        System.out.println("Here are sum, average number and the number of even and odd elements for 12 array:");
        averageAndSumOfTwoDimensionalIntArray(twoDimensionalArray);
        numberOfEvenAndOddNumbersTwoDimensionalIntArray(twoDimensionalArray);

    }

    static void averageAndSumOfOneDimensionalIntArray (int[] array) {
        double average = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + average);
    }

    static void numberOfEvenAndOddNumbersOneDimensionalIntArray (int[] array) {
        int even = 0, odd = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    static void averageAndSumOfTwoDimensionalIntArray (int[][] array) {
        int sum = 0, count = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        average = (double)sum / (double)count;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + average);
    }

    static void numberOfEvenAndOddNumbersTwoDimensionalIntArray (int[][] array) {
        int even = 0, odd = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
