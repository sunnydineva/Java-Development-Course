import java.util.Scanner;
public class L0405SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pens = Integer.parseInt(scan.nextLine());
        int markes = Integer.parseInt(scan.nextLine());
        int detergent = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

//        double pricePens = 5.80;
//        double priceMarkers = 7.20;
//        double priceDetergent = 1.20;

        double priceSubtotal = pens * 5.80 + markes * 7.20 + detergent * 1.20;
        double totalPrice = priceSubtotal - (priceSubtotal * discount / 100);

        System.out.println(totalPrice);
    }
}