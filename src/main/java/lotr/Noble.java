package lotr;

import java.util.Random;

public abstract class Noble extends Character {

    public Noble(int lowerBound, int upperBound) {
        super(new Random().nextInt(upperBound - lowerBound + 1) + lowerBound, new Random().nextInt(upperBound - lowerBound  + 1) + lowerBound);
    }

    @Override // maybe delete it
    public void kick(Character c) {
        // decrease number of hp of the enemy by
        // random number which will be in the range of his power
        int damage = new Random().nextInt(c.getPower());
        c.setHp(c.getHp() - damage);
    }
}