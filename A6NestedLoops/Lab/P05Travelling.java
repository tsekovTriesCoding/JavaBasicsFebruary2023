package A6NestedLoops.Lab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String destination = input;
            double budgetNeeded = Double.parseDouble(scanner.nextLine());

            double totalAmount = 0;
            while (totalAmount < budgetNeeded) {
                double amount = Double.parseDouble(scanner.nextLine());
                totalAmount += amount;
            }

            System.out.printf("Going to %s!%n", destination);

            input = scanner.nextLine();
        }

    }
}
