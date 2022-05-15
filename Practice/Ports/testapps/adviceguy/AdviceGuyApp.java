package testapps.adviceguy;

import java.io.*;
import java.net.*;
import java.util.Random;

/*The advice guy is a server program that offers up practical, inspirational tips
* to get you through those longs days of coding. App will pull a message from the server each time it connects.*/
public class AdviceGuyApp {
    String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat.",
            "One word: inappropriate", "Just for today, be honest. Tell your boss what you really think"};

    public  void go() {
        /*client connects to the server and gets an input stream from it*/
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true) {
                Socket sock = serverSocket.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);

            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAdvice() {
        return adviceList[(int) (Math.random() * adviceList.length)];
    }
    public static void main(String[] args) {
        AdviceGuyApp server = new AdviceGuyApp();
        server.go();
    }
}
