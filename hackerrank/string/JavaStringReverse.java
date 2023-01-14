package hackerrank.string;

import java.util.Scanner;

public class JavaStringReverse {
    //A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
    //
    //Given a string , print Yes if it is a palindrome, print No otherwise.
    //
    //Constraints
    //
    // A will consist at most 50 lower case english letters.
    //Sample Input
    //
    //madam
    //Sample Output
    //
    //Yes
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();

        char[] list = A.toCharArray();
        boolean isTheSame = true;

        for (int i = 0; i < list.length / 2; i++) {

            char leftChar = list[i];
            char rightChar = list[list.length - 1 -i];

            if(leftChar != rightChar){
                isTheSame = false;
                break;
            }
        }
        if(isTheSame){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
