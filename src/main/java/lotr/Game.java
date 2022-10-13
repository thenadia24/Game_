package lotr;

public class Game {

        public static void main(String[] args) {
            Character ch_1 = CharacterFactory.createCharacter();
            Character ch_2 = CharacterFactory.createCharacter();
            System.out.println(ch_1);
            System.out.println(ch_2);
            GameManager.game(ch_1, ch_2);
        }
    }
