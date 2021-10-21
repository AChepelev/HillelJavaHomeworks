package hw5.Task1.vehicles;


import hw5.Task1.details.Engine;
import hw5.Task1.professions.Driver;

public class Lorry extends Car{
    private Integer load;


    public Lorry(String mark, String type, Integer weight, Driver driver, Engine engine, Integer load) {
        super(mark, type, weight, driver, engine);
        this.load = load;
    }

    public Integer getLoad() {
        return load;
    }

    public void setLoad(Integer load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "load=" + load +
                '}';
    }
}
