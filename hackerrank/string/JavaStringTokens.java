package hackerrank.string;

import java.util.Scanner;

public class JavaStringTokens {
    //Given a string, s , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
    // We define a token to be one or more consecutive English alphabetic letters.
    // Then, print the number of tokens, followed by each token on a new line.
    // s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!),
    // commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
    //Output Format
    //
    //On the first line, print an integer, n , denoting the number of tokens in string  (they do not need to be unique).
    // Next, print each of the  tokens on a new line in the same order as they appear in input string .
    //
    //Sample Input
    //
    //He is a very very good boy, isn't he?
    //Sample Output
    //
    //10
    //He
    //is
    //a
    //very
    //very
    //good
    //boy
    //isn
    //t
    //he

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        if(s.trim().equals("")){
            System.out.println("0");
            return;
        }

        String[] val = s.trim().split("[\s!,?._'@]+");

        System.out.println(val.length);
        for(String string : val){
            System.out.println(string);
        }
    }
}
