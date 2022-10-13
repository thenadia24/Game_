package lotr;

import java.util.Random;


public class CharacterFactory {
    public static Character createCharacter() {
        Character[] characters = { new Hobbit(), new King(), new Knight(), new Elf()};
        int num = new Random().nextInt(characters.length);
        return  characters[num];
    }
}