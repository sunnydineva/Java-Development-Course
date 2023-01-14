package hackerrank.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams2 {
    //Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
    //
    //string a: the first string
    //string b: the second string
    //Returns
    //
    //boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
    //Input Format
    //
    //The first line contains a string .
    //The second line contains a string .
    //
    //Constraints
    //
    //Strings  and  consist of English alphabetic characters.
    //The comparison should NOT be case sensitive.
    //Sample Input 0
    //
    //anagram
    //margana
    //Sample Output 0
    //
    //Anagrams

    static boolean isAnagram(String a, String b) {

        String aLowerCase = a.toLowerCase();
        String bLowerCase = b.toLowerCase();

        char[] arrayA = aLowerCase.toCharArray();
        char[] arrayB = bLowerCase.toCharArray();

        // Complete the function
        if (arrayA.length != arrayB.length) return false;

        Map<Character, Integer> aa = new HashMap<>();
        Map<Character, Integer> bb = new HashMap<>();

        for (char ch : arrayA){
            if(aa.containsKey(ch)){
                aa.put(ch, aa.get(ch)+1);
            } else {
                aa.put(ch, 1);
            }
        }

        for (char ch : arrayB) {
            if(bb.containsKey(ch)){
                bb.put(ch, bb.get(ch)+1);
            } else {
                bb.put(ch, 1);
            }
        }
        return aa.equals(bb);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
