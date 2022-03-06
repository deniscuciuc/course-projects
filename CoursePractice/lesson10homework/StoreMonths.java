package lesson10homework;

public class StoreMonths {
    private enum MonthsOfYear {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static void storeMonths() {
        for (MonthsOfYear months : MonthsOfYear.values()) {
            System.out.println(months);
        }

    }
}
