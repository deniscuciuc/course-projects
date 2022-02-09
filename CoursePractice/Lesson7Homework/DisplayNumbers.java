package Lesson7Homework;

public class DisplayNumbers {
    public static void main (String[] args) {

        for (int i = 100, j = 0; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                j++;
            } else {
                continue;
            }
            if (j % 10 == 0) {
                System.out.println();
            }

        }
    }
}
