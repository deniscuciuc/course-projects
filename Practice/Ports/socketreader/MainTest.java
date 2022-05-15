package socketreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MainTest {
    public static void main(String[] args) throws IOException {
        /*source -> bytes from server -> converted to characters -> buffered characters -> client*/

        Socket chatSocket = new Socket("127.0.0.1", 5000);
        InputStreamReader stream = new InputStreamReader(chatSocket.getInputStream());
        BufferedReader reader = new BufferedReader(stream);
        String message = reader.readLine();

    }
}
