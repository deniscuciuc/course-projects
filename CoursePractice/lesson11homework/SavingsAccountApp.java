package lesson11homework;

public class SavingsAccountApp {
    public static void main (String[] args) {
        System.out.println("\033[01mLesson 11 Homework\033[0m");

        SavingsAccount saver1 = new SavingsAccount(2000.00, 4);
        SavingsAccount saver2 = new SavingsAccount(3000.00, 4);

        saver1.calculateMonthlyInterest();
        System.out.println("Saver 1 (4% rate): ");
        System.out.println("Balance: " + saver1.getSavingsBalance());

        saver2.calculateMonthlyInterest();
        System.out.println("Saver 2 (4% rate): ");
        System.out.println("Balance: " + saver2.getSavingsBalance());

        SavingsAccount.setAnnualInterestRate(5);

        saver1.calculateMonthlyInterest();
        System.out.println("Saver 1 (5% rate): ");
        System.out.println("Balance: " + saver1.getSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 2 (5% rate): ");
        System.out.println("Balance: " + saver2.getSavingsBalance());

    }
}
