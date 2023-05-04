package A3ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorBikers = Integer.parseInt(scanner.nextLine());
        int seniorBikers = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double priceJuniors = 0;
        double priceSeniors = 0;
        switch (trace) {
            case "trail":
                priceJuniors = juniorBikers * 5.50;
                priceSeniors = seniorBikers * 7;
                break;
            case "cross-country":
                priceJuniors = juniorBikers * 8;
                priceSeniors = seniorBikers * 9.50;
                if (juniorBikers + seniorBikers >= 50) {
                    priceJuniors = priceJuniors * 0.75;
                    priceSeniors = priceSeniors * 0.75;
                }
                break;
            case "downhill":
                priceJuniors = juniorBikers * 12.25;
                priceSeniors = seniorBikers * 13.75;
                break;
            case "road":
                priceJuniors = juniorBikers * 20;
                priceSeniors = seniorBikers * 21.50;
                break;
        }
        double profit = priceJuniors + priceSeniors;
        double expenses = 0.05 * profit;
        double donation = profit - expenses;

        System.out.printf("%.2f", donation);
    }
}
