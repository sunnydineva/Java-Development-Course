package stringManipulator;

public class MainStringManipulator {
    public static void main(String[] args) {
        String input = "myinputstring";
        StringManipulatorInterface stringManipulatorInterface = new StringManipulatorImpl();
        System.out.println(stringManipulatorInterface.toLowerCase(input));
        System.out.println(stringManipulatorInterface.toUpperCase(input));
        System.out.println(stringManipulatorInterface.toFirstUpper(input));
        System.out.println(stringManipulatorInterface.segregate(input));
        System.out.println(stringManipulatorInterface.charIndex(input));
    }
}
