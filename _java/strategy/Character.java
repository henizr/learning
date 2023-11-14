package learning._java.strategy;

public class Character {
    private WeaponBehavior weapon;

    public Character(){
        weapon = new KnifeBehavior();
    }

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }
    public void fight(){
        weapon.useWeapon();
    }
}
