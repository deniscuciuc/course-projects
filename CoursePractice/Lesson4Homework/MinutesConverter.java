package Lesson4Homework;

public class MinutesConverter {
    public static void main(String[] args) {
        long Minutes = 5;
        final double Days = 365;
        final double Years = 1;

        double  MinutesInHour = 60,
                MinutesInDay = MinutesInHour * 24,
                MinutesInYear = MinutesInDay * Days,
                ConvertMinutestoDays = Minutes / MinutesInDay,
                ConvertMinutestoYears = Minutes / MinutesInYear;

        System.out.println(Minutes + " minutes in days is " + ConvertMinutestoDays);
        System.out.println(Minutes + " minutes in years is " + ConvertMinutestoYears);

    }
}
