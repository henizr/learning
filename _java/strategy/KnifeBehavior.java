package learning._java.strategy;

public class KnifeBehavior implements WeaponBehavior {
    
    @Override
    public void useWeapon(){
        System.out.println("Kniiiif");
    }
}
