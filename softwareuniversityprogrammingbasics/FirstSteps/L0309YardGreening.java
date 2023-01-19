package softwareuniversityprogrammingbasics.FirstSteps;

import java.util.Scanner;

public class L0309YardGreening {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float SquareMtrs = Float.parseFloat(scan.nextLine());
        double Price = SquareMtrs * 7.61;
        double Discount = Price * 0.18;
        double FinalPrice = Price - Discount;

        System.out.println("The final price is: " + FinalPrice + " lv.");
        System.out.println("The discount is: " + Discount + " lv.");
    }
}