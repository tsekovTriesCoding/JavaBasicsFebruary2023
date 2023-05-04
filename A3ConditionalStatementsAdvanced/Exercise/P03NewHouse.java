package A3ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalCost = 0;

        switch (flowerType) {
            case "Roses":
                totalCost = flowerCount * 5;
                if (flowerCount > 80) {
                    totalCost = totalCost * 0.90;
                }
                break;
            case "Dahlias":
                totalCost = flowerCount * 3.80;
                if (flowerCount > 90) {
                    totalCost = totalCost * 0.85;
                }
                break;
            case "Tulips":
               totalCost = flowerCount * 2.80;
                if (flowerCount > 80) {
                    totalCost = totalCost * 0.85;
                }
               break;
            case "Narcissus":
               totalCost = flowerCount * 3;
                if (flowerCount < 120) {
                    totalCost = totalCost * 1.15;
                }
               break;
            case "Gladiolus":
                totalCost = flowerCount * 2.50;
                if (flowerCount < 80) {
                    totalCost = totalCost * 1.20;
                }
            break;
        }

        double diff = Math.abs(budget - totalCost);

        if (budget >= totalCost) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowerCount, flowerType, diff
            );
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
