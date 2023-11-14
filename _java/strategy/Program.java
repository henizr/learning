package learning._java.strategy;

public class Program {
    public static void main(String[] args) {
        Character character = new Character();
        character.fight();
        character.setWeapon(new SwordBehavior());
        character.fight();
        character.setWeapon(new AxeBehavior());
        character.fight();

    }
}
