package lotr;

public class Elf extends Character{
    
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < getPower()) {
            c.setHp(0);
        } else {
            c.setPower(getPower() - 1);
        }
        // kill everybody weaker than him, 
        // otherwise decrease the power of character by 1
    }
}