package A7ExamPreparation.RetakeExam2And3May2019;

import java.util.Scanner;

public class P04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        int productCounter = 0;
        double totalCost = 0;
        boolean noMoney = false;

        while (!command.equals("Stop")) {
            productCounter++;
            String product = command;
            double productCost = Double.parseDouble(scanner.nextLine());

            if (productCounter % 3 == 0) {
                productCost = productCost * 0.5;
            }

            totalCost += productCost;

            if (totalCost > budget) {
                noMoney = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (noMoney) {
            double diff = totalCost - budget;
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", diff);
        } else {
            System.out.printf("You bought %d products for %.2f leva.", productCounter, totalCost);
        }
    }
}
