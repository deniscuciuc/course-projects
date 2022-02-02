package Lesson4Homework;

public class MinutesConverter {
    public static void main(String[] args) {
        long Minutes = 5;
        double Days = 365;
        double Years = 1;

        double MinutesInHour = 60;
        double MinutesInDay = MinutesInHour * 24;
        double MinutesInYear = MinutesInDay * Days;


        double ConvertMinutestoDays = Minutes / MinutesInDay;
        double ConvertMinutestoYears = Minutes / MinutesInYear;

        System.out.println(Minutes + " minutes in days is " + ConvertMinutestoDays);
        System.out.println(Minutes + " minutes in years is " + ConvertMinutestoYears);

    }
}
