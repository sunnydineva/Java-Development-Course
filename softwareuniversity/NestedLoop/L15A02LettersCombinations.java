package softwareuniversity.NestedLoop;

import java.util.Scanner;

public class L15A02LettersCombinations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String begin = scanner.nextLine();
        String end = scanner.nextLine();
        String exception = scanner.nextLine();
        char start = begin.charAt(0);
        char stop = end.charAt(0);
        char without = exception.charAt(0);
        //97-122
        int counterCombinations = 0;

        for (int firstCharNew = start; firstCharNew <= stop; firstCharNew++) {
            for (int secondCharNew = start; secondCharNew <= stop; secondCharNew++) {
                for (int thirdCharNew = start; thirdCharNew <= stop; thirdCharNew++) {
                    if ((firstCharNew == without) || (secondCharNew == without) || (thirdCharNew == without)) {
                        continue;
                    }
                    counterCombinations++;
                    System.out.printf("%c%c%c ", firstCharNew, secondCharNew, thirdCharNew);
                }
            }
        }
        System.out.println(counterCombinations);
    }
}

