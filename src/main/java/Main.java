import lotr.Character;
import lotr.CharacterFactory;
import lotr.GameManager;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        GameManager gameManager = new GameManager();

        Character character1 = characterFactory.createCharacter();
        Character character2 = characterFactory.createCharacter();

        System.out.println("Character 1: " + character1);
        System.out.println("Character 2: " + character2);

        gameManager.fight(character1, character2);
    }
}

