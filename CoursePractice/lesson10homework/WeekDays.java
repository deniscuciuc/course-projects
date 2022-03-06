package lesson10homework;

public enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekDay () {
        return this != SATURDAY && this != SUNDAY;
    }

    boolean isHoliday () {
        return this == SATURDAY || this == SUNDAY;
    }
}
