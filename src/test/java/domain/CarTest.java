package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    @DisplayName("4이상이면 전진")
    @Test
    void moveOrStay(){
        Car car = new Car("k3");
        int randomNumber = 4;
        car.moveOrStay(4);
        assertThat(car.getPosition()).isEqualTo(1);
        car.moveOrStay(0);
        assertThat(car.getPosition()).isEqualTo(1);
        car.moveOrStay(9);
        assertThat(car.getPosition()).isEqualTo(2);
    }
}
