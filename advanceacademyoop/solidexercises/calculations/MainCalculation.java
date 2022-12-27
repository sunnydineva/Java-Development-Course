package advanceacademyoop.solidexercises.calculations;

import java.util.Arrays;
import java.util.List;

public class MainCalculation {

    /*
    3зад. Иван и Георги са ученици в първи клас, които се учат да смятат. Учителката е написала следните
числа на дъската:
15, 89, 2, 1, 76, 20
Децата имат за задача да:
1. намерят сбора на всички числа
2. намерят кое е най-голямото число
Въпреки че учителката е обяснила как се събират числа, Иван събира само четните числа, а също така
мисли, че най-голямото число винаги е това, което се намира на последно място, т.е. 20.
Георги също има свои начин за пресмятане на сбор – той включва само нечетните числа, а най-голямото
число винаги се намира на първо място, т.е. 15.
Да се напише програма, в която има методи за пресмятане на двете задачи, дадени от учителката,
имплементацията на всяко дете, както и правилният начин за пресмятане.
     */

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
