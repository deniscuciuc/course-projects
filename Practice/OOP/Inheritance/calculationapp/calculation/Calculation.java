package Inheritance.calculationapp.calculation;

public class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("Sum of given numbers is: " + z);
    }

    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers: " + z);
    }
}
