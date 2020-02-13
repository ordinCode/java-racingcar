package stringadder;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdder {
    public static final String ERROR_MESSAGE_NOT_INTEGER = "숫자만 입력 가능합니다.";

    public static int add(String input) {
        if (isNullOrBlank(input)) {
            return 0;
        }
        if (isNotCustom(input)) {
            return addNotCustom(input);
        }
        return splitCustomMarkAndSum(input);
    }

    private static int addNotCustom(String input) {
        String[] splittedNumbers = split(input);
        return validateAndSum(splittedNumbers);
    }

    private static int validateAndSum(String[] splittedNumbers) {
        validateNumbers(splittedNumbers);
        return sumWhenList(toIntegerList(splittedNumbers));
    }

    private static boolean isNullOrBlank(String input) {
        return input == null || input.isEmpty();
    }

    private static int splitCustomMarkAndSum(String input) {
        String numbers = numbersAndCustomMark(input).get(0);
        String customMark = numbersAndCustomMark(input).get(1);
        return addCustom(numbers, customMark);
    }

    private static int addCustom(String numbers, String customMark) {
        String[] splittedNumbers = splitWhenCustomMark(numbers, customMark);
        return validateAndSum(splittedNumbers);
    }

    private static String[] splitWhenCustomMark(String input, String customMark) {
        if (!customMark.equals("-")) {
            return input.split(customMark);
        }
        return splitWhenCustomMarkIsMinus(input);
    }

    public static String[] splitWhenCustomMarkIsMinus(String input) {
        String[] result = new String[3];
        Pattern pattern = Pattern.compile("(-?\\d)-(-?\\d)-(-?\\d)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            result[0] = matcher.group(1);
            result[1] = matcher.group(2);
            result[2] = matcher.group(3);
        }
        return result;
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

    public static int sumWhenList(List<Integer> numbers) {
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

    public static void validateNumbers(String[] splittedInput) {
        for (String str : splittedInput) {
            isNegativeNumber(str);
            isNotIntegerInput(str);
        }
    }

    private static void isNegativeNumber(String str) {
        if (str.contains("-")) {
            throw new RuntimeException("0 이상의 수를 입력하세요");
        }
    }

    private static void isNotIntegerInput(String str) {
        Pattern pattern = Pattern.compile("\\D");
        if (pattern.matcher(str).find()) {
            throw new RuntimeException(ERROR_MESSAGE_NOT_INTEGER);
        }
    }
}
