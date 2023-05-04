package A3ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        int boatPrice = 0;
        double totalCost = 0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }
        if (fisherman <= 6) {
            totalCost = boatPrice * 0.9;
        } else if (fisherman >= 7 && fisherman <= 11) {
            totalCost = boatPrice * 0.85;
        } else if (fisherman >= 12) {
            totalCost = boatPrice * 0.75;
        }

        if (fisherman % 2 == 0 && !season.equals("Autumn")) {
            totalCost = totalCost * 0.95;
        }

        double diff = Math.abs(budget - totalCost);

        if (budget >= totalCost) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
