package learning._java.strategy_04;

public abstract class Character {
    WeaponBehavior weapon;

    public void fight(){
        weapon.useWeapon();
    }
}
