package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        // to provide fight between to characters and explain via command
        // line what happens during fight, till both of
        // the characters are alive
        System.out.println(c1 + " is fighting with " + c2);

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " attacks " + c2.getClass().getSimpleName() + "!");
            c1.kick(c2);
            System.out.println(c2 + " has " + c2.getHp() + " hp left.");

            if (c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " attacks " + c1.getClass().getSimpleName() + "!");
                c2.kick(c1);
                System.out.println(c1 + " has " + c1.getHp() + " hp left.");
            } else {
                System.out.println(c2.getClass().getSimpleName() + " has been defeated!");
            }
        }

        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " won!");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " won!");
        }
    }
}
