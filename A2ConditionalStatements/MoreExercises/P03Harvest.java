package A2ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrape = x * y;
        //От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино.
        double sqrMetersForWine = totalGrape * 0.4;
        //За 1 литър вино са нужни 2,5 кг. грозде.
        double wineInleters = (sqrMetersForWine / 2.5);

        double wineDifference = Math.abs(wineInleters - z);
        double wineForWorkers = wineDifference / numberOfWorkers;

        if (wineInleters < z) {
            wineDifference = Math.floor(wineDifference);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(wineDifference));
        } else {
            wineDifference = Math.ceil(wineDifference);
            wineForWorkers = Math.ceil(wineForWorkers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wineInleters);
            System.out.printf("%.0f liters left -> %.0f liters per person.",wineDifference, wineForWorkers);
        }

    }
}
