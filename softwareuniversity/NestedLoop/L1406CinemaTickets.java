package softwareuniversity.NestedLoop;

import java.util.Scanner;

public class L1406CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int countTotalTickets = 0;
        int countStudentTickets = 0;
        int countStandardTickets = 0;
        int countKidTickets = 0;

        while (!input.equals("Finish")) {
            String movie = input;
            int seats = Integer.parseInt(scanner.nextLine());

            int countCurrentTickets = 0;
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                countCurrentTickets++;
                countTotalTickets++;

                switch (ticketType) {
                    case "student": {
                        countStudentTickets++;
                        break;
                    }
                    case "standard": {
                        countStandardTickets++;
                        break;
                    }
                    case "kid": {
                        countKidTickets++;
                        break;
                    }
                }

                if (countCurrentTickets >= seats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movie, countCurrentTickets * 1.0 / seats * 100);
            input = scanner.nextLine();
        }

        System.out.println("Total tickets: " + countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", countStudentTickets * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandardTickets * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", countKidTickets * 1.0 / countTotalTickets * 100);
    }
}
