package softwareuniversity.NestedLoop;

import java.util.Scanner;

public class L1504CarNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int stopNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <= stopNum; i++) {
            for (int j = startNum; j <= stopNum; j++) {
                for (int k = startNum; k <= stopNum; k++) {
                    for (int l = startNum; l <= stopNum; l++) {
                        boolean firstCondition = false;
                        boolean secondCondition = false;
                        boolean thirdCondition = false;
                        if (((i % 2 == 0) && (l % 2 != 0)) || ((i % 2 != 0) && (l % 2 == 0))) {
                            firstCondition = true;
                        }
                        if (i > l) {
                            secondCondition = true;
                        }
                        if ((j + k) % 2 == 0) {
                            thirdCondition = true;
                        }
                        if (firstCondition && secondCondition & thirdCondition) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
