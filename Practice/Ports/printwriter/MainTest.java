package printwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MainTest {
    public static void main(String[] args) throws IOException {
        /*source = client -> characters -> bytes to server -> server (destination)*/

        Socket chatSocket = new Socket("127.0.0.1", 5000);
        PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
        writer.println("message to send");
        writer.print("another message");

    }
}
