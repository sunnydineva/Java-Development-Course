package hackerrank.string;
import java.util.Scanner;

public class JavaSubstringComparisons {
    //Sample Input 0
    //
    //welcometojava
    //3
    //Sample Output 0
    //
    //ava
    //wel

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 1; i <= s.length() - k; i++) {
            String curr = s.substring(i, i + k);
            if (curr.compareTo(smallest) < 0) {
                smallest = curr;
            }
            if (curr.compareTo(largest) > 0) {
                largest = curr;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
