package external.practice.learn.inheritance;

public class Animal {
    protected String name;

    public void eat () {
        System.out.println("I can eat");
    }

    public void breath () {
        System.out.println("I can breath");
    }

    public void hear () {
        System.out.println("I can hear");
    }

    public void displayName () {
        System.out.println("My name is " + name);
    }
}
