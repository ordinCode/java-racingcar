package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class GameManagerTest {
    @DisplayName("','로 split 테스트")
    @Test
    void split(){
        String input = "k3,k5,audi";
        String[] result = GameManager.split(input);
        assertThat(result).containsExactly("k3","k5","audi");
    }

    @DisplayName("입력받은 이름으로 Car 객체 생성")
    @Test
    void setCarName(){
        String[] input = new String[]{"k3","k5","audi"};
        GameManager.setCarList(input);
        List<Car> result = new ArrayList<>();
        result.add(new Car("k3"));
        result.add(new Car("k5"));
        result.add(new Car("audi"));
        assertThat(GameManager.getCars()).isEqualTo(result);
    }
}
