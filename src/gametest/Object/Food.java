package gametest.Object;

public class Food {
    String name;
    Integer healthUp;

    public Food(String name, Integer healthUp) {
        this.name = name;
        this.healthUp = healthUp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealthUp() {
        return healthUp;
    }

    public void setHealthUp(Integer healthUp) {
        this.healthUp = healthUp;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", healthUp=" + healthUp +
                '}';
    }
}
