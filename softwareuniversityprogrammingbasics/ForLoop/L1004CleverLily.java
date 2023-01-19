package softwareuniversityprogrammingbasics.ForLoop;

import java.util.Scanner;

public class L1004CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        double money = 0;
        double allMoney = 0;
        int brother = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) { // Лили има четен рожден ден
                money = money + 10; // всеки път с 10лв повече
                allMoney = allMoney + money;
                brother++;
            } else {
                toysCount++;
            }

        }
        double toysSum = toysCount * toyPrice;
        double totalMoney = allMoney + toysSum - brother;
        double diff = Math.abs(totalMoney - washMachinePrice);

        if (totalMoney >= washMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);

        }
    }

}
