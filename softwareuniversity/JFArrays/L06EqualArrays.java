package softwareuniversity.JFArrays;
import java.util.Arrays;
import java.util.Scanner;

public class L06EqualArrays {
    public static void main(String[] args) {
    //Read two arrays and print on the console whether they are identical or not.
    // Arrays are identical if their elements are equal.
    // If the arrays are identical, find the sum of the first one and print on the console the following message:
    // "Arrays are identical. Sum: {sum}", otherwise find the first index where the arrays differ
    // and print on the console following message:
    // "Arrays are not identical. Found difference at {index} index."
    // 10 20 30
    // 10 20 30	Arrays are identical. Sum: 60
    // 1 2 3 4 5
    // 1 2 4 3 5	Arrays are not identical. Found difference at 2 index.
    Scanner scanner = new Scanner(System.in);
        int [] array1  = Arrays
            .stream(scanner.nextLine().split(" "))
            .mapToInt(value -> Integer.parseInt(value))
            .toArray();

        int [] array2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(f ->Integer.parseInt(f))
                .toArray();

        int sum = 0;
        boolean isEqual = true;
        for (int i = 0; i < array1.length; i++) {
            if (!isEqual) {
                break;
            }
            for (int j = 0; j < array2.length; j++) {
                if (!isEqual) {
                    break;
                }
                if(i == j) {
                    if (array1[i] == array2[j]) {
                        sum += array1[i];
                    } else {
                        System.out.printf("%nArrays are not identical. Found difference at %d index.", i);
                        isEqual = false;
                        break;
                    }
                }
            }
        }
        if (isEqual) {
            System.out.printf("%nArrays are identical. Sum: %d", sum);
        }
    }
}
