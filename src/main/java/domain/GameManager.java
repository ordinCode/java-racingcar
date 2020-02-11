package domain;

import view.InputView;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static List<Car> cars = new ArrayList<>();

    public void start(String names,int round){
        setCarList(split(names));
    }

    public static String[] split(String input) {
        return input.split(",");
    }

    public static void setCarList(String[] names) {
        for (String name : names){
            cars.add(new Car(name));
        }
    }

    public static List<Car> getCars() {
        return cars;
    }
}
