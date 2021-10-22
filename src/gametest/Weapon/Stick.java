package gametest.Weapon;

public class Stick extends Weapon{
    public Stick(String name, Integer weaponDamage) {
        super(name, weaponDamage);
    }

    @Override
    public String toString() {
        return "Stick{" +
                "name='" + name + '\'' +
                ", weaponDamage=" + weaponDamage +
                '}';
    }
}
