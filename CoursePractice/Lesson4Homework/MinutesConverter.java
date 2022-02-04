package Lesson4Homework;
import java.util.Scanner;


public class MinutesConverter {

    static long Year = 1,
                Days = 365;
    public static void main(String[] args) {

        // Minutes in x variable
        double  resultDay,
                resultYear,
                hour = 60, // or MINUTES_IN_HOUR
                day = hour * 24, // or MINUTES_IN_DAY
                year = day * Days; // or MINUTES_IN_YEAR



        Scanner userInput = new Scanner(System.in);
        System.out.println("How many minutes you want to convert to days and years? ");

        int Minutes = userInput.nextInt();
        userInput.close();

        resultDay = (double)Minutes / day;
        resultYear = (double)Minutes / year;

        System.out.println(Minutes + " minutes is " + resultDay + " day");
        System.out.println(Minutes + " minutes is " + resultYear + " year");


    }
}
