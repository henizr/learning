package learning._java.strategy_05;

public class King extends Character {
    public King() {
        super.weapon = new KnifeBehavior();
    }
    public void setWeapon(WeaponBehavior weapon){
        super.weapon = weapon;
    }
}
