package external.methods.Arrays;
import java.util.Arrays;

/**
 * There are three ways to find min and max values in arrays:
 *  1. for loop
 *  2. sort method
 *  3. recursion
 */
public class MinMax {
    public static void main (String[] args) {
        int[] intArray = {5, 6, 7, 9, 33};
        double[] doubleArray = {4.14, 4.15, 1.13};

        int[][] intTwoDimensionalArray = {{5, 6, 7, 8}, {1, 3, 4, 5}};
        double[][] doubleTwoDimensionalArray = {{5.14, 3.14, 2.15}, {1.14, 2.4, 5.12}};

        System.out.println("First way (for loop): ");
        System.out.println(getMaxValue(intArray));
        System.out.println(getMinValue(intArray));

        System.out.println("Second way (sort method): ");
        getMinAndMaxValueUsingSort(intArray);
    }

    /**
     * First way: looping through the array with for loop
     *
     * @return maxValue
     */
    public static int getMaxValue(int[] array){
        int maxValue = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public static int getMinValue(int[] array){
        int minValue = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    /**
     * Second way: using Arrays.sort method to Find Maximum and Minimum Values
     */
    public static void getMinAndMaxValueUsingSort (int[] array) {
        Arrays.sort(array);
        System.out.println("Minimum = " + array[0]);
        System.out.println("Maximum = " + array[array.length - 1]);

    }

}
