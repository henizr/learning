package learning._java.strategy_05;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(0, 3);
        WeaponBehavior[] weapons = new WeaponBehavior[] {
                new KnifeBehavior(),
                new SwordBEhavior(),
                new AxeBehavior()
        };

        King king = new King();
        king.fight();

        king.setWeapon(new AxeBehavior());
        king.fight();

        king.setWeapon(new SwordBEhavior());
        king.fight();

        king.setWeapon(new KnifeBehavior());
        king.fight();

        System.out.println("Choosing a random weapon...");
        king.setWeapon(weapons[randomIndex]);
        king.fight();
    }
}
