package A7ExamPreparation.Exam20And21April2019;

import java.util.Scanner;

public class P02EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double platePrice = Double.parseDouble(scanner.nextLine());
        double desisBudget = Double.parseDouble(scanner.nextLine());

        if (guests >= 10 && guests <= 15) {
            platePrice = platePrice * 0.85;
        } else if (guests > 15 && guests <= 20) {
            platePrice = platePrice * 0.80;
        } else if (guests > 20) {
            platePrice = platePrice * 0.75;
        }

        double cakePrice = desisBudget * 0.1;
        double totalCost = guests * platePrice + cakePrice;

        double diff = Math.abs(totalCost - desisBudget);

        if (desisBudget >= totalCost) {
            System.out.printf("It is party time! %.2f leva left.", diff);
        } else {
            System.out.printf("No party! %.2f leva needed.", diff);
        }
    }
}
