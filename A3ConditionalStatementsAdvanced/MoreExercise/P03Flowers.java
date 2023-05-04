package A3ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrisantems = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double hrisantemsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;

        int totalflowerCount = hrisantems + roses + tulips;

        if (season.equals("Spring") || season.equals("Summer")) {
            hrisantemsPrice = 2.00;
            rosesPrice = 4.10;
            tulipsPrice = 2.50;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            hrisantemsPrice = 3.75;
            rosesPrice = 4.50;
            tulipsPrice = 4.15;
        }
        double totalCost = hrisantems * hrisantemsPrice + roses * rosesPrice + tulips * tulipsPrice;

        if (holiday.equals("Y")) {
            totalCost = totalCost * 1.15;
        }

        if (season.equals("Spring") && tulips > 7) {
            totalCost = totalCost * 0.95;
        } else if (season.equals("Winter") && roses >= 10) {
            totalCost = totalCost * 0.90;
        }
        if (totalflowerCount >= 20) {
            totalCost = totalCost * 0.80;
        }
        totalCost = totalCost + 2;
        System.out.printf("%.2f", totalCost);
    }
}
