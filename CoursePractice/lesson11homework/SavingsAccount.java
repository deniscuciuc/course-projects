package lesson11homework;

public class SavingsAccount {
    final int MONTHS = 12;
    private double savingsBalance;
    private static double annualInterestRate;

    public SavingsAccount (double savingsBalance, double annualInterestRate) {
        this.savingsBalance = savingsBalance;
        SavingsAccount.annualInterestRate = annualInterestRate / 100;
    }

    public static void setAnnualInterestRate (double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate /  100;
    }

    public double getSavingsBalance () {
        return savingsBalance;
    }

    public void calculateMonthlyInterest () {
        savingsBalance += (savingsBalance * annualInterestRate / MONTHS);
    }
}
