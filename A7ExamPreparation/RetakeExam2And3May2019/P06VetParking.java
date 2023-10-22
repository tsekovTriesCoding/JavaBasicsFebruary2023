package A7ExamPreparation.RetakeExam2And3May2019;

import java.util.Scanner;

public class P06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hoursADay = Integer.parseInt(scanner.nextLine());

        double totalCost = 0;

        for (int i = 1; i <= days; i++) {
            double cost = 0;
            for (int j = 1; j <= hoursADay; j++) {

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
