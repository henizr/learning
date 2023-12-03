package learning._java.strategy_05;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("[using a knife]");  
    }

}
