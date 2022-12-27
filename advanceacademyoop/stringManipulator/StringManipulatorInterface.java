package advanceacademyoop.stringManipulator;

import java.util.Map;

public interface StringManipulatorInterface {

    String toLowerCase(String input);

    String toUpperCase(String input);

    String toFirstUpper(String input);

    String segregate(String input);

    Map<Integer, String> charIndex(String input);

}
