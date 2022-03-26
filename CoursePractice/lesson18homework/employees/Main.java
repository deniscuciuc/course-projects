package lesson18homework.employees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfEmployees = 0;
        Scanner numberOfEmployeesObj = new Scanner(System.in);
        System.out.println("How many employees you want to enroll? ");
        do {
            numberOfEmployees = numberOfEmployeesObj.nextInt();
            if (numberOfEmployees <= 0) {
                System.out.println("Invalid input.");
                System.out.println("Please enter the valid number of employees!");
            } else {
                System.out.println("You successfully added " + numberOfEmployees);
            }
        } while (numberOfEmployees <= 0);



    }
}
