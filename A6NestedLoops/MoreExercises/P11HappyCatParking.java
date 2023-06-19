package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P11HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalCost = 0;

        for (int i = 1; i <= days; i++) {
            double cost = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    cost += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    cost += 1.25;
                } else {
                    cost += 1;
                }
            }
            totalCost += cost;
            System.out.printf("Day: %d - %.2f leva%n", i, cost);
        }
        System.out.printf("Total: %.2f leva", totalCost);
    }
}
