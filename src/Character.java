abstract class Character {
    //attributes
    private String name;
    private WeaponBehavior weapon;

    public Character(String n){
        this.name = n;
    }
    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }

    public abstract void fight();
}
