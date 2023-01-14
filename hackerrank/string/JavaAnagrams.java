package hackerrank.string;

import java.util.Scanner;

public class JavaAnagrams {
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

        if(a.length() != b.length()) return false;

        int[] first = new int[26]; //the alphabet size

        String aa = a.toLowerCase();
        String bb = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            char chA = aa.charAt(i);
            char chB = bb.charAt(i);

            first[chA-'a']++; //increments the position in the alphabet
            first[chB-'a']--; //decrements the position in the alphabet
        }
        for(int x: first){
            if(x!=0){
                return false;
            }
        }
        return true;
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
