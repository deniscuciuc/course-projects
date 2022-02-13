package Lesson8Homework;

import java.util.Scanner;

public class CalculateArray {
    public static void main(String[] args) {
        firstArray();





    }


    static void  firstArray() {
        System.out.println("Enter the required size of the array :: ");
        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        int firstArray[] = new int [arraySize];
        int sum = 0, avg = 0, odd = 0, even = 0;


        System.out.println("Enter the elements of the array one by one ");
        for(int i = 0; i < arraySize; i++){
            firstArray[i] = s.nextInt();
            sum = sum + firstArray[i];
        }

        avg = sum / arraySize;

        for (int i : firstArray) {
            if (i % 2 == 0) {
                even = even + firstArray[i];
            } else {
                odd = odd + firstArray[i];
            }
        }



    }
}
