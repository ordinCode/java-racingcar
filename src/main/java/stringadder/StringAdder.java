package stringadder;

import java.util.ArrayList;
import java.util.List;

public class StringAdder {
    public static int adder(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        return 1;
    }

    public static List<Integer> toInt(String[] input) {
        List<Integer> result = new ArrayList<>();
        for (String str : input) {
            result.add(Integer.parseInt(str));
        }
        return result;
    }

    public static int sumList(List<Integer> numbers) {
        return numbers.stream()
                .reduce((x, y) -> x + y)
                .get();
    }

    public static String[] split(String str) {
        return str.split(",|:");
    }
}
