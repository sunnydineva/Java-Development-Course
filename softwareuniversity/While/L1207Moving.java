package softwareuniversity.While;

import java.util.Scanner;

public class L1207Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volume = width * length * height;
        String input = scanner.nextLine();
        int freeSpace = volume;
        boolean isFull = false;

        while (!input.equals("Done")) {
            int usedSpace = Integer.parseInt(input);
            ;
            freeSpace -= usedSpace;
            if (freeSpace <= 0) {
                isFull = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isFull) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        } else {
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}
