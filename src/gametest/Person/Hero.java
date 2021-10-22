package gametest.Person;

public class Hero extends Person{

    Integer exp;

    public Hero(String name, Integer damage, Integer health, Integer exp) {
        super(name, damage, health);
        this.exp = exp;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "exp=" + exp +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                '}';
    }
}
