package solidexercises.calculations;

import java.util.List;

public class GeorgeCalculationsImpl implements Calculations {


    @Override //odd
    public int sum(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers)
            if (number % 2 != 0) {
                result += number;
            }
        return result;
    }

    @Override // Georgi thinks that the max number is the one on the first position in the list
    public int findMaxNumber(List<Integer> numbers) {
        return numbers.get(0);
    }
}
