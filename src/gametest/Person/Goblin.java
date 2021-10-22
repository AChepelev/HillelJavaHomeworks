package gametest.Person;

public class Goblin extends Person{
    public Goblin(String name, Integer damage, Integer health) {
        super(name, damage, health);
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                '}';
    }
}
