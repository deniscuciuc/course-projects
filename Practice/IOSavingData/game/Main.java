package game;

import game.characters.Character;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
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

        secondCharacter = null;
        thirdCharacter = null;

        Character testReader = (Character) firstCharacter.readObjectFromFile("MyGame.ser");
        System.out.println(testReader);


    }


}
