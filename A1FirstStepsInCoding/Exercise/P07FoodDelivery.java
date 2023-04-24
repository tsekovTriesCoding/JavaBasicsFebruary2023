package A1FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ChickenMenus = Integer.parseInt(scanner.nextLine());
        int FishMenus = Integer.parseInt(scanner.nextLine());
        int VegetarianMenus = Integer.parseInt(scanner.nextLine());

        double TotalCostMenus = ChickenMenus * 10.35 + FishMenus * 12.40 + VegetarianMenus * 8.15;
        double DesertCost = TotalCostMenus * 0.2;
        double TotalCost = TotalCostMenus + DesertCost + 2.50;

        System.out.println(TotalCost);
    }
}
