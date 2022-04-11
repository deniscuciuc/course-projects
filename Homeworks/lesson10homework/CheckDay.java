package lesson10homework;

public class CheckDay {

    public static void checkDay() {
        System.out.println(WeekDays.SUNDAY.isWeekDay());
        System.out.println(WeekDays.MONDAY.isWeekDay());
        System.out.println(WeekDays.THURSDAY.isHoliday());
        System.out.println(WeekDays.SUNDAY.isHoliday());
        System.out.println(WeekDays.SATURDAY.isHoliday());
        System.out.println(WeekDays.TUESDAY.isWeekDay());
    }
}
