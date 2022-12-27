package softwareuniversity.NestedLoop;

import java.util.Scanner;

public class L1506WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char lastSector = input.charAt(0);
        String startSector = "A";
        char startChar = startSector.charAt(0);

        int rowsInFirstSector = Integer.parseInt(scanner.nextLine());

        int seatsInOddRow = Integer.parseInt(scanner.nextLine());
        int seatsCount = 0;

        for (int sector = startChar; sector <= lastSector; sector++) {
            if (sector > startChar) {
                rowsInFirstSector++;
            }
            for (int rows = 1; rows <= rowsInFirstSector; rows++) {

                int seatsTotal = 0;
                if (rows % 2 != 0) {
                    seatsTotal = seatsInOddRow;
                } else {
                    seatsTotal = seatsInOddRow + 2;
                }
                char seats = 'a';

                for (int i = 1; i <= seatsTotal  ; i++) {
                    seatsCount ++;
                    if (i > 1) {
                        seats++;
                    }

                    System.out.printf("%c%d%c%n", sector, rows, seats);
                }


            }


        }
        System.out.println(seatsCount);

    }
}
