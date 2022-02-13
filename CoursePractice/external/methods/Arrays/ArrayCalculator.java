package external.methods.Arrays;

/**
 * Here are my trying to make an usefull methods to manipulate arrays
 * @author deniscuciuc
 */
public class ArrayCalculator {
    public static void main (String[] args) {

        int[] intArray = {5, 6, 7, 9, 33};
        double[] doubleArray = {4.14, 4.15, 1.13};

        int[][] intTwoDimensionalArray = {{5, 6, 7, 8}, {1, 3, 4, 5}};
        double[][] doubleTwoDimensionalArray = {{5.14, 3.14, 2.15}, {1.14, 2.4, 5.12}};



        sumOfOneDimensionalIntArray(intArray);
        sumOfOneDimensionalDoubleArray(doubleArray);
        averageOfOneDimensionalDoubleArray(doubleArray);
        numberOfEvenAndOddNumbersOneDimensionalIntArray(intArray);
        numberOfEvenAndOddNumbersTwoDimensionalIntArray(intTwoDimensionalArray);
        sumOfTwoDimensionalIntArray(intTwoDimensionalArray);
        sumOfTwoDimensionalDoubleArray(doubleTwoDimensionalArray);
        averageOfTwoDimensionalIntArray(intTwoDimensionalArray);
        averageOfTwoDimensionalDoubleArray(doubleTwoDimensionalArray);
        numberOfEvenAndOddNumbersTwoDimensionalIntArray(intTwoDimensionalArray);


    }

    // To calculate sum of elements in one dimensional int array
    static void sumOfOneDimensionalIntArray (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum is: " + sum);
    }

    // To calculate sum of elements in one dimensional double array
    static void sumOfOneDimensionalDoubleArray (double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum is: " + sum);
    }

    static void averageOfOneDimensionalDoubleArray (double[] array) {
        double average = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println("The avg value is: " + average);
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
        System.out.println("The even numbers in one dimensional int array are: " + even);
        System.out.println("The odd numbers in one dimensional int array are: " + odd);
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
        System.out.println("The even numbers in two dimensional int array are: " + even);
        System.out.println("The odd numbers in two dimensional int array are: " + odd);
    }

    static void sumOfTwoDimensionalIntArray (int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("Sum of elements from two dimensional int array is: " + sum);
    }

    static void sumOfTwoDimensionalDoubleArray (double[][] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("Sum of elements from two dimensional double array is: " + sum);
    }

    static void averageOfTwoDimensionalIntArray (int[][] array) {
        int sum = 0, count = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        average = (double)sum / (double)count;
        System.out.println("Avg of two dimensional int array is: " + average);
    }

    static void averageOfTwoDimensionalDoubleArray (double[][] array) {
        double sum = 0, average = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        average = sum / (double)count;
        System.out.println("Avg of two dimensional double array is: " + average);
    }
}
