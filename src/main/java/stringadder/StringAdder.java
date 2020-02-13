package stringadder;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdder {
    public static int add(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        if (isNotCustom(input)) {
            return sumList(toIntegerList(split(input)));
        }
        return addCustom(input);
    }

    private static int addCustom(String input) {
        String numbers = numbersAndCustomMark(input).get(0);
        String customMark = numbersAndCustomMark(input).get(1);
        return sumList(toIntegerList(splitWhenCustomMark(numbers, customMark)));
    }

    private static String[] splitWhenCustomMark(String input, String customMark) {
        return input.split(customMark);
    }

    public static boolean isNotCustom(String input) {
        return input.charAt(0) != '/';
    }

    public static List<Integer> toIntegerList(String[] input) {
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

    public static List<String> numbersAndCustomMark(String input) {
        List<String> result = new ArrayList<>();
        Pattern p = Pattern.compile("//(.)\n(.+)");
        Matcher m = p.matcher(input);
        if (m.find()) {
            result.add(m.group(2));
            result.add(m.group(1));
        }
        return result;
    }
}
