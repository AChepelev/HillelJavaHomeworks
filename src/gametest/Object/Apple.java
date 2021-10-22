package gametest.Object;

public class Apple extends Food{


    public Apple(String name, Integer healthUp) {
        super(name, healthUp);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", healthUp=" + healthUp +
                '}';
    }
}
