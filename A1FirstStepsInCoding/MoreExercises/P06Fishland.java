package A1FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSkumriq = Double.parseDouble(scanner.nextLine());
        double priceTsatsa = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgClams = Double.parseDouble(scanner.nextLine());

        double pricePalamud = priceSkumriq + priceSkumriq * 0.6;
        double priceSafrid = priceTsatsa + priceTsatsa * 0.8;

        double totalCost = kgPalamud * pricePalamud + kgSafrid * priceSafrid + kgClams * 7.50;

        System.out.printf("%.2f", totalCost);
    }
}
