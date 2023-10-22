package A7ExamPreparation.Exam20And21April2019;

import java.util.Scanner;

public class P01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourCost = Double.parseDouble(scanner.nextLine());
        double kgsFlour = Double.parseDouble(scanner.nextLine());
        double kgsSugar = Double.parseDouble(scanner.nextLine());
        int packsOfEggs = Integer.parseInt(scanner.nextLine());
        int packsOfYeast = Integer.parseInt(scanner.nextLine());

        double flourTotalCost = flourCost * kgsFlour;
        double sugarCost = flourCost * 0.75;
        double sugarTotalCost = sugarCost * kgsSugar;
        double packOfEggsCost = flourCost * 1.1 * packsOfEggs;
        double packOfYeastCost = sugarCost * 0.2 * packsOfYeast;

        double totalCost = flourTotalCost + sugarTotalCost + packOfEggsCost + packOfYeastCost;

        System.out.printf("%.2f", totalCost);
    }
}
