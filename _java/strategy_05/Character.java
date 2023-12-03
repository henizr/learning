package learning._java.strategy_05;

public class Character {
    WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }
}
