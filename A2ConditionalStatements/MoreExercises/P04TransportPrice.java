package A2ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nKilometers = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double cost = 0;
        double beginningFeeTaxi = 0.70;

        if (nKilometers < 20) {
            if (timeOfDay.equals("day")) {
                cost = beginningFeeTaxi + nKilometers * 0.79;
                System.out.printf("%.2f", cost);
            } else if (timeOfDay.equals("night")) {
                cost = beginningFeeTaxi + nKilometers * 0.90;
                System.out.printf("%.2f", cost);
            }
        } else if (nKilometers >= 100) {
            cost = nKilometers * 0.06;
            System.out.printf("%.2f", cost);
        } else {
            cost = nKilometers * 0.09;
            System.out.printf("%.2f", cost);
        }
    }
}

