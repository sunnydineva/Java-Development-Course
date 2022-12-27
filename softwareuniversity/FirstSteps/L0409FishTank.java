import java.util.Scanner;

public class L0409FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        Float percent = Float.parseFloat(scan.nextLine());

        double volume = lenght * width * height;
        double volumeLt = volume / 1000;
        double volumeReserved = percent * 0.01;
        double volumeFree = volumeLt - volumeLt * volumeReserved;

        System.out.println(volumeFree);
    }
}