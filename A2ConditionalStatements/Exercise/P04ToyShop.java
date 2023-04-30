package A2ConditionalStatements.Exercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddybears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totalToys = puzzles + dolls + teddybears + minions + trucks;
        double totalCost = puzzles * 2.60 + dolls * 3 + teddybears * 4.10 + minions * 8.20 + trucks * 2;

        double discount = 0;

        if (totalToys >= 50) {
            discount = totalCost * 0.25;
        }
        totalCost = totalCost - discount;
        double profit = totalCost - totalCost * 0.1;

        if (profit >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", profit - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - profit);
        }
    }
}
