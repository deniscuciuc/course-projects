package Inheritance.animalsdata;

import Inheritance.animalsdata.animals.*;

public class AnimalsStoreDataApp {
    public static void main(String[] args) {
        Birds newBird = new Birds(18);
        newBird.setTemperature(36.6f);
        int newBirdAge = newBird.getAge();
        float newBirdTemperature = newBird.getTemperature();
        System.out.println("Info about birds:");
        System.out.println("Bird: ");
        System.out.println("Age: " + newBirdAge);
        System.out.println("Temperature: " + newBirdTemperature);
        System.out.println("Actions: ");
        newBird.breath();
        newBird.eat();

    }
}
