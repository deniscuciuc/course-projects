package lesson10homework;

public class CheckDay extends Main {
    private enum Weekday {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        boolean isWeekDay () {
            boolean isWeekDay = true;
            if (this == SATURDAY || this == SUNDAY) {
                isWeekDay = false;
            }
            return isWeekDay;
        }

        boolean isHoliday () {
            boolean isHolidayDay = true;
            if (this != SATURDAY && this != SUNDAY) {
                isHolidayDay = false;
            }
            return isHolidayDay;
        }

    }

    public static void checkDay() {
        System.out.println(Weekday.SUNDAY.isWeekDay());
        System.out.println(Weekday.MONDAY.isWeekDay());
        System.out.println(Weekday.THURSDAY.isHoliday());
        System.out.println(Weekday.SUNDAY.isHoliday());
        System.out.println(Weekday.SATURDAY.isHoliday());
        System.out.println(Weekday.TUESDAY.isWeekDay());
    }
}
