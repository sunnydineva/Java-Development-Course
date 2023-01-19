package softwareuniversityprogrammingbasics.While;

import java.util.Scanner;

public class L1206Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lengthCake = Integer.parseInt(scanner.nextLine());
        int widthCake = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean noMoreCake = false;
        int totalcakepieces = lengthCake * widthCake;

        while (!command.equals("STOP")) {
            int piecesCake = Integer.parseInt(command);
            totalcakepieces -= piecesCake;
            if (totalcakepieces <= 0) {
                noMoreCake = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (noMoreCake) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalcakepieces));
        } else {
            System.out.printf("%d pieces are left.", totalcakepieces);
        }
    }
}
