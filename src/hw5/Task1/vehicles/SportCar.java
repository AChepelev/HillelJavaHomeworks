package hw5.Task1.vehicles;


import hw5.Task1.details.Engine;
import hw5.Task1.professions.Driver;

public class SportCar extends Car {
    private Integer maxSpeed;

    public SportCar(String mark, String type, Integer weight, Driver driver, Engine engine, Integer maxSpeed) {
        super(mark, type, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
