package game;

import game.characters.Character;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Character firstCharacter = new Character("1", 50, "Elf");
        Character secondCharacter = new Character("2",200, "Troll");
        Character thirdCharacter = new Character("3",50, "Magician");

        try {
            FileOutputStream fileStream = new FileOutputStream("MyGame.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            os.writeObject(firstCharacter);
            os.writeObject(secondCharacter);
            os.writeObject(thirdCharacter);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
