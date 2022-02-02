package Lesson4Homework;

public class TaxCalculator {
    public static void main(String[] args) {
        double Price = 9.99;
        double Tax = 2.99;
        int Quantity = 2;
        double Total = Price * Quantity * Tax;

        System.out.println("Total cost with tax is " + Total);
    }
}
