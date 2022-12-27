import java.util.Scanner;

public class L0406Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double priceNylon = (nylon + 2) * 1.50;
        double pricePaint = paint * 1.1 * 14.50;
        double priceThinner = thinner * 5.00;
        double PriceMaterials = priceNylon + pricePaint + priceThinner + 0.40;
        double PriceWorkers = PriceMaterials * 0.3 * hours;
        double TotalPrice = PriceMaterials + PriceWorkers;

        System.out.println(TotalPrice);
    }
}