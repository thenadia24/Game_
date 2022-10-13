package lotr;

import java.util.Random;

public class King extends Character{
    public King() {
        super(new Random().nextInt(10)+5, new Random().nextInt(10)+5);
    }

    @Override
    public void kick(Character character) {
        int new_hp = character.getHp()-new Random().nextInt(getPower());
        character.setHp(new_hp);
    }
}
