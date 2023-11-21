package learning._java.strategy_03;

/**
 * Character
 */
public class Character {

    WeaponBehavior weapon;

    public void fight(){
        weapon.useWeapon();
    }
}