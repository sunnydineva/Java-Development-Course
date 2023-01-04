package hackerrank.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
//Given a double-precision number payment, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

    //Sample Input
    //12324.134

    //Sample Output
    //US: $12,324.13
    //India: Rs.12,324.13
    //China: ￥12,324.13
    //France: 12 324,13 €
//Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
    //run under Java 8 to work
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pay = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(pay);

        Locale IND = new Locale("en","IN");
        String india = NumberFormat.getCurrencyInstance(IND).format(pay);

        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(pay);
        String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(pay);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
   }
}
