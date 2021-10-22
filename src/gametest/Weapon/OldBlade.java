package gametest.Weapon;

public class OldBlade extends Weapon{
    public OldBlade(String name, Integer weaponDamage) {
        super(name, weaponDamage);
    }

    @Override
    public String toString() {
        return "OldBlade{" +
                "name='" + name + '\'' +
                ", weaponDamage=" + weaponDamage +
                '}';
    }
}
