package lotr;

//import org.reflections.Reflections;

import java.util.Random;

//import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    public static Character createCharacter() {
        Character[] characters = { new Hobbit(), new King(), new Knight(), new Elf()};
        int num = new Random().nextInt(characters.length);
        return  characters[num];
    }
}