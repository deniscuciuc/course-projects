package Inheritance.overriding;

public class Dog extends Animal {
    @Override
    public void move() {
        super.move();
        System.out.println("Dogs can move");
    }
}
