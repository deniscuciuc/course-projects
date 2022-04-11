package lesson7homework;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean stop = true;

        do {
            Scanner sumObject = new Scanner(System.in);
            double[] inputNumbers = new double[2];

            System.out.println("Type here two numbers to take the sum: ");
            for (int i = 0; i < inputNumbers.length; i++) {
                inputNumbers[i] = sumObject.nextDouble();
            }


            double sum = inputNumbers[0] + inputNumbers[1];
            System.out.println("The sum is " + sum);

            Scanner askUser = new Scanner(System.in);
            System.out.println("If you want to repeat operation type - YES, if not - NO: ");
            String reply = askUser.nextLine();

            if (reply.equalsIgnoreCase("No")) {
                stop = false;
            }




        } while (stop);

    }
}
