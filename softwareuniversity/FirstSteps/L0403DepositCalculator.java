package softwareuniversity.FirstSteps;

import java.util.Scanner;
public class L0403DepositCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float deposit = Float.parseFloat(scan.nextLine());
        int time = Integer.parseInt(scan.nextLine());
        float rate = Float.parseFloat(scan.nextLine());
        float annualRate = deposit * rate / 100;
        float rate_per_month = annualRate / 12;
        float total_sum = deposit + time * rate_per_month;

        System.out.println(total_sum);
    }
}
