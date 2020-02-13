package stringadder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringAdderTest {

    @Test
    void 공란입력시_0리턴() {
        String blank = "";
        assertThat(StringAdder.adder(blank)).isEqualTo(0);

        assertThat(StringAdder.adder(null)).isEqualTo(0);

    }
}
