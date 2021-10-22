package gametest.Person;

public class Rat extends Person{
    public Rat(String name, Integer damage, Integer health) {
        super(name, damage, health);
    }

    @Override
    public String toString() {
        return "Rat{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                '}';
    }
}
