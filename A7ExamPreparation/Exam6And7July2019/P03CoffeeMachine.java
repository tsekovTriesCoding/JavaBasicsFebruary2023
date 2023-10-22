package A7ExamPreparation.Exam6And7July2019;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String beverage = scanner.nextLine();
        String sugar = scanner.nextLine();
        int beverageCount = Integer.parseInt(scanner.nextLine());

        double cost = 0;

        switch (beverage) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    cost = 0.9 * beverageCount * 0.65;
                } else if (sugar.equals("Normal")) {
                    cost = 1.0 * beverageCount;
                } else if (sugar.equals("Extra")) {
                    cost = 1.2 * beverageCount;
                }

                if (beverageCount >= 5) {
                    cost = cost * 0.75;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    cost = 1.0 * beverageCount * 0.65;
                } else if (sugar.equals("Normal")) {
                    cost = 1.2 * beverageCount;
                } else if (sugar.equals("Extra")) {
                    cost = 1.6 * beverageCount;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    cost = 0.5 * beverageCount * 0.65;
                } else if (sugar.equals("Normal")) {
                    cost = 0.6 * beverageCount;
                } else if (sugar.equals("Extra")) {
                    cost = 0.7 * beverageCount;
                }
                break;
        }

        if (cost > 15) {
            cost = cost * 0.8;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", beverageCount, beverage, cost);
    }
}
