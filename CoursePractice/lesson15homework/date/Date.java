package lesson15homework.date;

import java.util.Scanner;


public class Date {
    private int month;
    private int day;
    private int year;


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month > 12 || month <= 0 ? getNewMonthValue() : month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day > 31 || day <= 0 ? getNewDayValue() : day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(getDay() +" / " + getMonth() + " / " + getYear());
    }


    public int getNewMonthValue() {
        Scanner monthObj = new Scanner(System.in);
        System.out.println("The month was declared with the wrong value, change it: ");
        int newMonth = monthObj.nextInt();
        return newMonth;
    }

    public int getNewDayValue() {
        Scanner dayObj = new Scanner(System.in);
        System.out.println("The day was declared with the wrong value, change it: ");
        int newDay = dayObj.nextInt();
        return newDay;
    }
}
