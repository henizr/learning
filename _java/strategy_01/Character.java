package learning._java.strategy_01;

public abstract class Character {
    private WeaponBehavior weapon;

    public Character(){
        weapon = new SwordBehavior();
    }

    public void fight(){
        weapon.useWeapon();
    }
}
