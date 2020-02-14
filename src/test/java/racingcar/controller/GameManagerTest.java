package racingcar.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class GameManagerTest {
    @DisplayName("이름을 입력받아 ',' 로 분리")
    @Test
    public void nameSplit() {
        String input = "k3,k5,audi";
        String[] names = InputView.nameSplit(input);
        assertThat(names).containsExactly("k3", "k5", "audi");
    }

    @DisplayName("입력받은 이름으로 car 객체 생성")
    @Test
    void setCars() {
        String[] input = new String[]{"k3", "k5"};

        List<Car> result = new ArrayList<>();
        result.add(new Car("k3"));
        result.add(new Car("k5"));

        assertThat(GameManager.setCars(input)).isEqualTo(result);
    }

    @DisplayName("4이상 숫자가 주어지면 전진")
    @Test
    void MoveOrStay() {
        Car car = new Car("car");
        GameManager.moveOrStay(car, 1);
        assertThat(car.getPosition()).isEqualTo(0);

        GameManager.moveOrStay(car, 4);
        assertThat(car.getPosition()).isEqualTo(1);

        GameManager.moveOrStay(car, 4);
        GameManager.moveOrStay(car, 6);
        assertThat(car.getPosition()).isEqualTo(3);
    }

    @DisplayName("게임이 끝났는지 출력")
    @Test
    void isEnd() {
        GameManager gameManager = new GameManager(new String[]{"a", "b"}, 4);
        assertThat(gameManager.isNotEnd()).isTrue();
        gameManager.race();
        gameManager.race();
        assertThat(gameManager.isNotEnd()).isTrue();
        gameManager.race();
        gameManager.race();
        assertThat(gameManager.isNotEnd()).isFalse();


    }
}
