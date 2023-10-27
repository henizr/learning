public class Program {
    public static void main(String[] args) {
        Duck marralDuck = new MallarDuck();
//        marralDuck.performQuack();
        marralDuck.performFly();
        marralDuck.setFlyBehavior(new FlyRocketPowered());
        marralDuck.performFly();
    }
}
