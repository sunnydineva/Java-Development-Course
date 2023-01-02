package hackerrank.introduction;

import java.util.Scanner;

public class JavaIntToString {
    //You are given an integer , you have to convert it into a string.
    //
    //Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
    //
    // can range between  to  inclusive.
    //
    //Sample Input 0
    //
    //100
    //Sample Output 0
    //
    //Good job

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String convertedString = scanner.nextLine().toString();
            System.out.println("Good job");
        } catch (Exception e){
            System.out.println("Wrong answer");
        }





    }

}
