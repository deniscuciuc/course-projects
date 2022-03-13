package lesson12homework.primenumbers;

public class PrimeNumbers {

    boolean isNumberPrime(int number) {
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    void printPrimeNumbers() {
        for (int i = 0; i < 10_000; i++) {
            if (!isNumberPrime(i)) {
                System.out.println(i);
            } else {
                System.out.print("");
            }
        }
    }
}
