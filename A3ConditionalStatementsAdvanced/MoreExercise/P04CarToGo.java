package A3ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";
        double cost = 0;

        if (budget <= 100) {
            carClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                cost = budget * 0.35;
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                cost = budget * 0.65;
            }
        } else if (budget >100 && budget <= 500) {
            carClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                cost = budget * 0.45;
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                cost = budget * 0.80;
            }
        } else {
            if (season.equals("Summer") || season.equals("Winter")) {
                carClass = "Luxury class";
                carType = "Jeep";
                cost = budget * 0.9;
            }
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f",carType, cost);
    }
}
