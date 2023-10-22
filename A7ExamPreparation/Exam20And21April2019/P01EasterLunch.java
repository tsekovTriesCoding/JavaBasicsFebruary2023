package A7ExamPreparation.Exam20And21April2019;

import java.util.Scanner;

public class P01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());
        int packsOfEggs = Integer.parseInt(scanner.nextLine());
        int cookiesKgs = Integer.parseInt(scanner.nextLine());

        double easterBreadCost = easterBreads * 3.20;
        double eggsCost = packsOfEggs * 4.35;
        double cookiesCost = cookiesKgs * 5.40;
        double eggPaintCost = packsOfEggs * 12 * 0.15;

        double totalCost = easterBreadCost + eggsCost + cookiesCost + eggPaintCost;

        System.out.printf("%.2f", totalCost);
    }
}
