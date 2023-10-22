package A7ExamPreparation.Exam20And21April2019;

import java.util.Scanner;

public class P02EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterBreads = Math.ceil(guests * 1.0 / 3);
        double eggsNeded = guests * 2;
        double totalCost = easterBreads * 4 + eggsNeded * 0.45;

        double diff = Math.abs(budget - totalCost);

        if (budget >= totalCost) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", easterBreads, eggsNeded);
            System.out.printf("He has %.2f lv. left.", diff);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", diff);
        }
    }
}
