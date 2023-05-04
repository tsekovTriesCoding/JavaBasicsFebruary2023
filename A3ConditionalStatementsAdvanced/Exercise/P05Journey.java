package A3ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String  accommodation= "";
        double cost = 0;

        if (budget <= 100 && season.equals("summer")) {
            destination =  "Bulgaria";
            accommodation = "Camp";
            cost = 0.3 * budget;
        } else if (budget <= 100 && season.equals("winter")) {
            destination =  "Bulgaria";
            accommodation = "Hotel";
            cost = 0.7 * budget;
        } else if (budget <= 1000 && season.equals("summer")) {
            destination =  "Balkans";
            accommodation = "Camp";
            cost = 0.4 * budget;
        } else if (budget <= 1000 && season.equals("winter")) {
            destination =  "Balkans";
            accommodation = "Hotel";
            cost = 0.8 * budget;
        } else if (budget > 1000 && (season.equals("summer")) || season.equals("winter")) {
            destination =  "Europe";
            accommodation = "Hotel";
            cost = 0.9 * budget;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accommodation , cost);

    }
}
