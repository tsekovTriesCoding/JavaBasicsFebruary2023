package A7ExamPreparation.Exam6And7July2019;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int sleeps = Integer.parseInt(scanner.nextLine());
        double sleepCost = Double.parseDouble(scanner.nextLine());
        int percentMoreCosts = Integer.parseInt(scanner.nextLine());

        if (sleeps > 7) {
            sleepCost = (sleepCost * 0.95);
        }

        double totalSleepCost = sleepCost * sleeps;
        double moreCosts = budget * percentMoreCosts / 100;
        double totalCosts = totalSleepCost + moreCosts;

        double diff = Math.abs(totalCosts - budget);

        if (totalCosts <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }

    }
}
