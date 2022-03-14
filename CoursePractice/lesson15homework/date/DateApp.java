package lesson15homework.date;
import java.util.Scanner;
public class DateApp {
    public static void main(String[] args) {
        Date date1 = new Date();
        date1.setDay(25);
        date1.setMonth(4);
        date1.setYear(2022);
        date1.displayDate();
        Date date2 = new Date();
        date2.setDay(-5);
        date2.setMonth(34);
        date2.setYear(-746);
        date2.displayDate();
    }
}
