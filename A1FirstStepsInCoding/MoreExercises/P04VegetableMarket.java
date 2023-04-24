package A1FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForVegetables = Double.parseDouble(scanner.nextLine());
        double priceForFruits = Double.parseDouble(scanner.nextLine());
        int kgsVegetables = Integer.parseInt(scanner.nextLine());
        int kgsFruits = Integer.parseInt(scanner.nextLine());

        double totalCostInLeva = (priceForVegetables * kgsVegetables) + (priceForFruits * kgsFruits);
        double totalCostineuro = totalCostInLeva / 1.94;

        System.out.printf("%.2f", totalCostineuro);
    }
}
