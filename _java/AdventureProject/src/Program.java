public class Program {
    public static void main(String[] args) {
        King king = new King();
        king.fight();
        king.setWeapon(new Axebehavior());
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();
    }
}
