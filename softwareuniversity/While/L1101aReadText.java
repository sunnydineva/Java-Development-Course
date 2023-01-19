package softwareuniversity.While;

import java.util.Scanner;

public class L1101aReadText {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("Stop")) {
            System.out.println(word);
            word = scanner.nextLine();
        }
    }
}
