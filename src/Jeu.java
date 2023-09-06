public class Jeu {
    public static void main(String[] args) {
        Knight k1 = new Knight("Lancelot");
        k1.setWeapon(new SwordBehavior());
        Troll t1 = new Troll("troll");
        t1.setWeapon(new GunBehavior());
    }
}
