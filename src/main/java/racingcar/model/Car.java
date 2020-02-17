package racingcar.model;

import java.util.Objects;

public class Car {
    private final String name;
    private Position position = new Position();

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        position.plusOneStep();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position.getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
