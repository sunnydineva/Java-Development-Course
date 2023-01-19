package softwareuniversityprogrammingbasics.FirstSteps;

import java.util.Scanner;

public class L0408BasketballEquipment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int annualMembership = Integer.parseInt(scan.nextLine());
        double Shoes = annualMembership * 0.60;
        double Clothes = Shoes - Shoes * 0.20;
        double Ball = Clothes * 0.25;
        double Accessories = Ball * 0.20;
        double Equipment = Shoes + Clothes + Ball + Accessories;
        double AnnualExpenses = Equipment + annualMembership;

        System.out.println(AnnualExpenses);
    }
}