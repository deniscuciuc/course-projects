package Lesson4Homework;

public class TaxCalculator {
    public static void main(String[] args) {
        double price = 9.99;
        double tax = 2.99;
        int quantity = 2;
        double total = price * quantity * tax;

        System.out.println("total cost with tax is " + total);
    }
}
