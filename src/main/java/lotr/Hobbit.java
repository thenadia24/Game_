package lotr;

public class Hobbit extends Character{
    public Hobbit() {
        super(0,3);
    }
    @Override
    public void kick(Character character) {
        System.out.println("Hobbit is crying");
    }

    }

