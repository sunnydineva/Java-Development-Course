package softwareuniversity.JFArrays;

import java.util.Scanner;

public class ReadingArrayValuesfromASingleLine {

    public static void main(String[] args) {
 //Arrays can be read from a single line of separated values
//2 8 30 25 40 72 -2 44 56
        Scanner sc = new Scanner(System.in);
                String values = sc.nextLine();
                String[] items = values.split(" ");
                int[] arr = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            arr[i] = Integer.parseInt(items[i]);
        }
        System.out.println(arr.toString()); // tuk printira tova: [I@4edde6e5 - trabva da go opravq


    }


}
