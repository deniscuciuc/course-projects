package serializable;

import java.io.*;
import java.util.ArrayList;

public class SerialExample {
    public static void printData(ArrayList<Emp> Employees) {
        for (Emp emp : Employees) {
            System.out.println("name = " + emp.name);
            System.out.println("age = " + emp.age);
            System.out.println("a = " + emp.a);
            System.out.println("b = " + emp.b);
        }
    }


    public static void main(String[] args) {
        ArrayList<Emp> empObjects = new ArrayList<>();
        Emp object = new Emp("ab", 20, 2, 1000);
        Emp object1 = new Emp("Denis", 14, 4, 3000);
        empObjects.add(object);
        empObjects.add(object1);
        String fileName = "output.txt";


        /* Serialization */
        try {
            /* Saving of object in a file*/
            FileOutputStream file = new FileOutputStream (fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);


            /* Method for serialization of object*/
            out.writeObject(empObjects);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n"
                    + "Data before Deserialization.");
            printData(empObjects);


        } catch (IOException e) {
            e.printStackTrace();
        }

        empObjects = null;

        /* Deserialization */
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            empObjects = (ArrayList<Emp>) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");

            printData(empObjects);

        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException" +
                    " is caught");
        }
    }
}
