package hackerrank.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaDataTypes {

    //Input Format
    //
    //The first line contains an integer, T , denoting the number of test cases.
    //Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.
    //
    //Output Format
    //
    //For each input variable  and appropriate primitive , you must determine if the given primitives
    // are capable of storing it. If yes, then print:
    //
    //n can be fitted in:
    //* dataType
    //If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).
    //
    //If the number cannot be stored in one of the four aforementioned primitives, print the line:
    //
    //n can't be fitted anywhere.


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine().trim());

        for (int i = 0; i < T; i++) {
            String input = reader.readLine().trim();
            try {
                long n = Long.parseLong(input);
                System.out.println(n + " can be fitted in:");

                if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE & n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (Exception e){
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        reader.close();
    }
}
