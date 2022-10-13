package lotr;

import java.util.Random;

public class Knight extends Character{
    public Knight() {
        super(new Random().nextInt(10)+2, new Random().nextInt(10)+2);
    }

    @Override
    public void kick(Character character) {
        int new_hp = character.getHp()-new Random().nextInt(getPower());
        character.setHp(new_hp);
    }
}