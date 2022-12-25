package solidexercises.calculations;

import java.util.Arrays;
import java.util.List;

public class MainCalculation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(89, 15, 2, 1, 76, 20);

        Calculations ivanCalculation = new IvanCalculationsImpl();
        System.out.println(ivanCalculation.sum(numbers));
        System.out.println(ivanCalculation.findMaxNumber(numbers));

        System.out.println("-----------------------");
        Calculations georgeCalculation = new GeorgeCalculationsImpl();
        System.out.println(georgeCalculation.sum(numbers));
        System.out.println(georgeCalculation.findMaxNumber(numbers));

        System.out.println("-----------------------");
        Calculations calculations = new CalculationsImpl();
        System.out.println(calculations.sum(numbers));
        System.out.println(calculations.findMaxNumber(numbers));
    }
}
