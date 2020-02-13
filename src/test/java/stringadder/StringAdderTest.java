package stringadder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class StringAdderTest {
    String[] splittedString = new String[]{"1", "2", "3"};
    List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2));

    @Test
    void 공란입력시_0리턴() {
        String blank = "";
        assertThat(StringAdder.add(blank)).isEqualTo(0);
        assertThat(StringAdder.add(null)).isEqualTo(0);
    }

    @DisplayName("'1,2,3','1:2,3' 계산")
    @Test
    void add() {
        String input = "1,2,3";
        assertThat(StringAdder.add(input)).isEqualTo(6);

        input = "1:2,3";
        assertThat(StringAdder.add(input)).isEqualTo(6);
    }

    @DisplayName("커스텀식 최종 계산")
    @Test
    void addCustom() {
        String input = "//;\n1;2;3";
        assertThat(StringAdder.add(input)).isEqualTo(6);

        input = "//]\n1]6]3";
        assertThat(StringAdder.add(input)).isEqualTo(10);
    }

    @DisplayName("커스텀식인지 확인")
    @Test
    void isNotCustom() {
        String input = "1,2,3";
        assertThat(StringAdder.isNotCustom(input)).isFalse();

        input = "//;\n1;2;3";
        assertThat(StringAdder.isNotCustom(input)).isTrue();

    }

    @DisplayName("String[] 입력시 ArrayList<Integer>로 리턴")
    @Test
    void toInt() {
        assertThat(StringAdder.toIntegerList(splittedString)).isEqualTo(numbers1);
    }

    @DisplayName("ArrayList<Integer> 를 주면 sum하여 리턴")
    @Test
    void SumList() {
        int result1 = StringAdder.sumWhenList(numbers1);
        int result2 = StringAdder.sumWhenList(numbers2);

        assertThat(result1).isEqualTo(6);
        assertThat(result2).isEqualTo(3);
    }

    @DisplayName("split")
    @Test
    void split() {
        String str1 = "1,2,3";
        assertThat(StringAdder.split(str1)).isEqualTo(splittedString);

        String str2 = "1:2,3";
        assertThat(StringAdder.split(str2)).isEqualTo(splittedString);
    }

    @DisplayName("'//;\n1;2;3' 입력시 ';' 와 '1;2;3' 로 나누는 기능")
    @Test
    void splitCustom() {
        String input = "//;\n1;2;3";
        List<String> result = new ArrayList<>(Arrays.asList("1;2;3", ";"));

        assertThat(StringAdder.numbersAndCustomMark(input)).isEqualTo(result);
    }
}
