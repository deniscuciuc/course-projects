package lesson10homework;

public class CheckDay {

    public static void checkDay() {
        System.out.println(Weekdays.SUNDAY.isWeekDay());
        System.out.println(Weekdays.MONDAY.isWeekDay());
        System.out.println(Weekdays.THURSDAY.isHoliday());
        System.out.println(Weekdays.SUNDAY.isHoliday());
        System.out.println(Weekdays.SATURDAY.isHoliday());
        System.out.println(Weekdays.TUESDAY.isWeekDay());
    }
}
