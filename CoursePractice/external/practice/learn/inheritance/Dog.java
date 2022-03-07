package external.practice.learn.inheritance;

public class Dog extends Animal{
    @Override
    public void eat () {
        super.eat();
        System.out.println("I eat dog food");

    }

    public void bark () {
        System.out.println("I can bark like a dog");
    }
}
