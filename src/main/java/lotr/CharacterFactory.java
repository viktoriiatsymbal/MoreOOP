package lotr;

import java.util.Random;

public class CharacterFactory {
    private static final Class<?>[] CHARACTER_CLASSES = {Hobbit.class, Elf.class, King.class, Knight.class};
    private Random random = new Random();

    public Character createCharacter() {
        int index = random.nextInt(CHARACTER_CLASSES.length);
        try {
            return (Character) CHARACTER_CLASSES[index].getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
