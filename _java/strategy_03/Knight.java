package learning._java.strategy_03;

public class Knight extends Character {
    public Knight(){
        weapon = new KnifeBehavior();
    }
}
