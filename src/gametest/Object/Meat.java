package gametest.Object;

public class Meat extends Food {
    public Meat(String name, Integer healthUp) {
        super(name, healthUp);
    }

    @Override
    public String toString() {
        return "Meat{" +
                "name='" + name + '\'' +
                ", healthUp=" + healthUp +
                '}';
    }
}
