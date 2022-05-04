package throwtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestMain {
    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }
    public static void findFile() throws IOException {
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException exception) {
            System.out.println(exception);
        }
        try {
            findFile();
            System.out.println("Rest of code in try block");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
