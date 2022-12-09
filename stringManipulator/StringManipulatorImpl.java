package stringManipulator;

import java.util.HashMap;
import java.util.Map;

public class StringManipulatorImpl implements StringManipulatorInterface {
    @Override
    public String toLowerCase(String input) {
        return input.toLowerCase();
    }

    @Override
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    @Override
    public String toFirstUpper(String input) {
        String firstLetter = input.charAt(0) + "";
        String firstUpperLetter = toUpperCase(firstLetter);
        String allLowerCase = toLowerCase(input);
        String allWithoutFirst = allLowerCase.substring(1);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstUpperLetter);
        stringBuilder.append(allWithoutFirst);
        String result = stringBuilder.toString();
        return result;
    }

    @Override
    public String segregate(String input) {
        char[] inputChars = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char inputChar : inputChars) {
            stringBuilder.append(inputChar).append(" ");
        }
        String result = stringBuilder.toString();
        return result;
    }

    @Override
    public Map<Integer, String> charIndex(String input) {
        Map<Integer, String> result = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            String currentChar = input.charAt(i) + "";
            result.put(i, currentChar);
        }
        return result;
    }
}
