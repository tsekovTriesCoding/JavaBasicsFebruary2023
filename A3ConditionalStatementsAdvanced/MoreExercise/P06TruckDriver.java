package A3ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double wage = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kmPerMonth <= 5000) {
                    wage = 0.75 * 4 * kmPerMonth;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    wage = 0.95 * 4 * kmPerMonth;
                } else if (kmPerMonth > 10000 && kmPerMonth < 20000) {
                    wage = 1.45 * 4 * kmPerMonth;
                }
                wage = wage * 0.9;
                System.out.printf("%.2f", wage);
                break;
            case "Summer":
                if (kmPerMonth <= 5000) {
                    wage = 0.90 * 4 * kmPerMonth;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    wage = 1.10 * 4 * kmPerMonth;
                } else if (kmPerMonth > 10000 && kmPerMonth < 20000) {
                    wage = 1.45 * 4 * kmPerMonth;
                }
                wage = (wage * 0.9);
                System.out.printf("%.2f", wage);
                break;
            case "Winter":
                if (kmPerMonth <= 5000) {
                    wage = 1.05 * 4 * kmPerMonth;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    wage = 1.25 * 4 * kmPerMonth;
                } else if (kmPerMonth > 10000 && kmPerMonth < 20000) {
                    wage = 1.45 * 4 * kmPerMonth;
                }
                wage = wage * 0.9;
                System.out.printf("%.2f", wage);
                break;
        }
    }
}
