package softwareuniversity.While;

import java.util.Scanner;

public class L1101ReadText {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("Stop")) {
                break;
            }
            System.out.println(word);
        }
    }
}

