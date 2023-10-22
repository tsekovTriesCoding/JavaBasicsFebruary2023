package A7ExamPreparation.Exam6And7April2019;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothingCost = Double.parseDouble(scanner.nextLine());

        if (statists > 150) {
            clothingCost = clothingCost * 0.9;
        }

        double decorCost = budget * 0.1;
        double clothingAllCost = clothingCost * statists;
        double totalCost = decorCost + clothingAllCost;

        double diff = Math.abs(budget - totalCost);

        if (totalCost <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }

    }
}
