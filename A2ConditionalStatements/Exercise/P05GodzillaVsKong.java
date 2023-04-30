package A2ConditionalStatements.Exercise;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double  clothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double clothesCost = statists * clothesPrice;


        if (statists > 150) {
            clothesCost = clothesCost - clothesCost * 0.1;
        }
        double movieCost = decor + clothesCost;

        if (budget >= movieCost) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - movieCost);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", movieCost - budget);
        }
    }
}
