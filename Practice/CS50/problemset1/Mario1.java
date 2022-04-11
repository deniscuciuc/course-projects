package problemset1;
import java.util.Scanner;

public class Mario1 {
    public static void main(String[] args) {
        int heightOfPyramid;
        System.out.println("Height: ");
        Scanner heightObj = new Scanner(System.in);
        do {

            heightOfPyramid = heightObj.nextInt();

        } while (heightOfPyramid <= 0 || heightOfPyramid > 8);

        for (int rows = 0; rows < heightOfPyramid; rows++) {
            for (int dots = heightOfPyramid; dots > rows; dots--) {
                System.out.print(" ");
            }
            for (int hashes = 0; hashes < rows; hashes++) {
                System.out.print("#");
            }
            System.out.println("");
        }



    }
}
