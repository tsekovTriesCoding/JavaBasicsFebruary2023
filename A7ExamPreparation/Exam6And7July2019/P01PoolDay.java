package A7ExamPreparation.Exam6And7July2019;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double sunBedCost = Double.parseDouble(scanner.nextLine());
        double umbrellaCost = Double.parseDouble(scanner.nextLine());

        double totalTax = people * tax;
        double sunBedsTotalCost = Math.ceil(0.75 * people) * sunBedCost;
        double umbrellasTotalCost = Math.ceil(0.5 * people) * umbrellaCost;
        double totalCostAll = totalTax + sunBedsTotalCost + umbrellasTotalCost;

        System.out.printf("%.2f lv.", totalCostAll);

    }
}
