package gametest.Weapon;

public class Weapon {
    String name;
    Integer weaponDamage;

    public Weapon(String name, Integer weaponDamage) {
        this.name = name;
        this.weaponDamage = weaponDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(Integer weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", weaponDamage=" + weaponDamage +
                '}';
    }
}
