package problemset1;

import java.util.Scanner;

import static java.lang.Math.round;

public class Cash {
    public static void main(String[] args) {
        int numberOfCoins = 0, numberOfQuarters = 0, numberOfDimes = 0, numberOfNickels = 0, numberOfPennies = 0;
        final int QUARTER = 25, DIME = 10, NICKEL = 5, PENNY = 1;
        float userAmount;
        Scanner changeObj = new Scanner(System.in);
        System.out.println("Change owed: ");
        do {
            userAmount = changeObj.nextFloat();

        } while (userAmount < 0.1);

        int usersConvertedCents = round(userAmount * 100);


        while (usersConvertedCents - QUARTER >= 0) {
            usersConvertedCents = usersConvertedCents - QUARTER;
            numberOfQuarters++;
        }
        while (usersConvertedCents - DIME >= 0) {
            usersConvertedCents = usersConvertedCents - DIME;
            numberOfDimes++;
        }
        while (usersConvertedCents - NICKEL >= 0) {
            usersConvertedCents = usersConvertedCents - NICKEL;
            numberOfNickels++;
        }
        while (usersConvertedCents - PENNY >= 0) {
            usersConvertedCents = usersConvertedCents - PENNY;
            numberOfPennies++;
        }


        numberOfCoins = numberOfQuarters + numberOfDimes + numberOfNickels + numberOfPennies;


        System.out.println("Used coins: " + numberOfCoins);
        System.out.println("Coins we used:");
        System.out.println("Quarters: " + numberOfQuarters);
        System.out.println("Dimes: " + numberOfDimes);
        System.out.println("Nickels: " + numberOfNickels);
        System.out.println("Pennies: " + numberOfPennies);

    }
}
