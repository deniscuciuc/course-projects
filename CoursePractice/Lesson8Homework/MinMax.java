package Lesson8Homework;

public class MinMax {
    public static void main (String[] args) {
        int[] array = {5, 6, 7, 9, 33};

        System.out.println(getMaxValue(array));
        System.out.println(getMinValue(array));
    }

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
}
