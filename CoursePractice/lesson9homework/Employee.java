package lesson9homework;
import java.util.Formatter;

public class Employee {
    private String name;
    private int yearOfJoining;
    private String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void display() {
        Formatter formatter = new Formatter();
        formatter.format("%1$-10s%2$-13s%3$-10s\n", name, yearOfJoining, address);
        System.out.println(formatter);
    }

    public static void main(String[] args) {
        Employee[] arrayEmployee;
        arrayEmployee = new Employee[3];
        arrayEmployee[0] = new Employee("Robert", 1994, "64C- WallsStreat");
        arrayEmployee[1] = new Employee("Sam", 2000, "68D- WallsStreat");
        arrayEmployee[2] = new Employee("John", 1999, "26B- WallsStreat");

        System.out.println("Name " + " Year of joining " + " Address \n");
        for (Employee Employee : arrayEmployee) {
            Employee.display();
        }
    }
}
