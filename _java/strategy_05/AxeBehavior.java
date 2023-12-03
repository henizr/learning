package learning._java.strategy_05;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("[using an axe]");
    }

}
