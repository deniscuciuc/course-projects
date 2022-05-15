package game.characters;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Character implements Serializable {

    transient private String id;
    private int power;
    private String race;

    public Character(String id,int power, String race) {
        this.id = id;
        this.power = power;
        this.race = race;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Character readObjectFromFile(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(filePath);
        ObjectInputStream objIn = new ObjectInputStream(fileIn);

        Character characterObj = (Character) objIn.readObject();
        System.out.println("The object has been read from the file!");
        objIn.close();
        return characterObj;
    }
}
