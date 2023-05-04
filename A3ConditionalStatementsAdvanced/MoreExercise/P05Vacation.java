package A3ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String accommodation = "";
        double cost = 0;

        if (budget <= 1000) {
            accommodation = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                cost = budget * 0.65;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                cost = budget * 0.45;
            }
        } else if (budget > 1000 && budget <= 3000) {
            accommodation = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                cost = budget * 0.80;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                cost = budget * 0.60;
            }
        } else {
            accommodation = "Hotel";
            if (season.equals("Summer")) {
                location = "Alaska";
                cost = budget * 0.90;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                cost = budget * 0.90;
            }
        }

        System.out.printf("%s - %s - %.2f", location, accommodation, cost);
    }
}
