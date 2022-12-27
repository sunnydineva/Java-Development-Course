package advanceacademyoop.solidexercises.calculations;

import java.util.List;

public class IvanCalculationsImpl implements Calculations{


    @Override //even
    public int sum(List<Integer> numbers) {
        int result = 0;
        for(Integer number : numbers)
        if(number % 2 == 0) {
            result += number;
        }
        return result;
    }

    @Override // Ivan thinks that the max number is the one on the last position in the list
    public int findMaxNumber(List<Integer> numbers) {
        int lasNumberIndex = numbers.size() -1;
        return numbers.get(lasNumberIndex);
    }
}
