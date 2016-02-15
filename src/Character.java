public abstract class Character {

    private WeaponBehavior weapon;
    private String name;

    public Character(String n) {
        this.name = n;
    }
    
    public void fight() {
        System.out.print(name + " attacks");
        weapon.useWeapon();
        System.out.println();
    }

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
