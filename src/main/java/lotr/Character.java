package lotr;

import java.util.Random;

public class Character {
    private int hp;
    private int power;

    public Character() {

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public boolean isAlive() {
        return this.getHp()>0;
        }

    public void kick(Character character) {
        System.out.println();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
