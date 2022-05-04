package trycatch;

public class TestMain {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
            System.out.println("Rest of code");
        } catch (ArithmeticException exception) {
            System.out.println("Arithmetic Exception => " + exception.getMessage());
        } finally {
            System.out.println("This is finally block");
        }
    }
}
