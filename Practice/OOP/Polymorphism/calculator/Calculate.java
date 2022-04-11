package Polymorphism.calculator;

public class Calculate {
    // Overloading methods
    static int Multiply(int a, int b) {
        return a * b;
    }

    static int Multiply(int a, int b, int c) {
        return a * b * c;
    }

    static double Multiply(double a, double b) {
        return a * b;
    }
}
