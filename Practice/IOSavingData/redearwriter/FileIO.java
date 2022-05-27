package redearwriter;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        String[] names = {"John", "Carl", "Jerry"};

        /*writing data into a text file*/
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            /*write in file all what we need*/
            writer.write("Writing to a file.");
            writer.write("\nAnother line.");

            for (String name : names) {
                writer.write("\n" + name);
            }
            /*close filer writer*/
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*Read data from a file*/

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));


            /*reader.readline() will read a line of text then it will put in line variable
            * Loop will continue before the line is not null*/
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
