package Inheritance.calculationapp;

import Inheritance.calculationapp.calculation.TestCalculationClass;

public class CalculationApp {
    public static void main(String[] args) {
        int a = 20, b = 10;
        TestCalculationClass demo = new TestCalculationClass();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
    }
}
