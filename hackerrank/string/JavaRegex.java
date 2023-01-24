package hackerrank.string;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex{ // String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
        public static String zeroTo255 =  "("
            + "\\d{1,2}" //one or two digits
            + "|(0|1)\\d{2}" //three digits starting with o or 1
            + "|2[0-4]\\d" //three digits starting with 20..24
            + "|25[0-5]" //250...255
            + ")";
    public static String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
    Pattern p = Pattern.compile(pattern);
}


