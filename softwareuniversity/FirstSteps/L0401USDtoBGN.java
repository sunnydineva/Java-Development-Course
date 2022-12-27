import java.util.Scanner;

public class L0401USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double USD = Double.parseDouble(scan.nextLine());
        double BGN = USD * 1.7954;
        System.out.println(BGN);
    }
}