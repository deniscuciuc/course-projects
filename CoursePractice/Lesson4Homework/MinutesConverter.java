package Lesson4Homework;

public class MinutesConverter {
    public static void main(String[] args) {
        long Minutes = 5;
        double Days = 365;
        double Years = 1;

        int DaysinYear = (int)Days;

        int MinutesinHour = 60;
        int MinutesinDay = 24 * MinutesinHour;
        int MinutesinYear = MinutesinDay * DaysinYear;

        long YearResult = Minutes / MinutesinYear;
        long DayResult = Minutes / MinutesinDay;

        System.out.println("5 minutes in years is " + YearResult);
        System.out.println("5 minutes in days is " + DayResult);

    }
}
