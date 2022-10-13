package lotr;

public class GameManager {
    public static void main(String[] args) {
        Character first = CharacterFactory.createCharacter();
        Character second = CharacterFactory.createCharacter();
        game(first, second);
    }
    public static void game(Character ch_1, Character ch_2) {
        while (ch_2.isAlive() && ch_1.isAlive()) {
            System.out.println(ch_1 + " kicks  " + ch_2);
            ch_1.kick(ch_2);
            System.out.println("ch_2: " + ch_2);
            if (ch_2.isAlive()) {
                System.out.println(ch_2 + " kicks  " + ch_1);
                ch_2.kick(ch_1);
                System.out.println("ch_1: " + ch_1);
            }
        }
        if (ch_2.isAlive()) {
            System.out.println("Character " + ch_2 + " wins!");
        } else if (ch_1.isAlive()) {
            System.out.println("Character " + ch_1 + " wins!");
        }
    }
}

