package advanceacademyoop.solidexercises.calculations;

import java.util.List;

public class CalculationsImpl implements Calculations {


    @Override //odd
    public int sum(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }

    @Override
    public int findMaxNumber(List<Integer> numbers) {
        Integer maxNumber = Integer.MIN_VALUE;
        for(Integer currentNumber : numbers){
            if(currentNumber > maxNumber){
                maxNumber = currentNumber;
            }
        }
        return maxNumber;
    }
}
