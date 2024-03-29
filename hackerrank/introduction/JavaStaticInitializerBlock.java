package hackerrank.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static boolean flag = true;
    static int B;
    static int H;

    static {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        try {
            if (b <= 0 || h <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
            B = b;
            H = h;
        } catch (Exception e) {
            flag = false;
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
