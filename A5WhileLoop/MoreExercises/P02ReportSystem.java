package A5WhileLoop.MoreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ammount = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int operationCount = 0;
        int cashCounter = 0;
        int cardCounter = 0;
        int totalMoneyCash = 0;
        int totalMoneyCard = 0;
        int totalMoney = 0;

        boolean enoughMoney = false;

        while (!command.equals("End")) {
            operationCount++;
            int price = Integer.parseInt(command);

            if (operationCount % 2 != 0) {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    cashCounter++;
                    totalMoneyCash += price;
                    System.out.println("Product sold!");
                }
            } else {
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    cardCounter++;
                    totalMoneyCard += price;
                    System.out.println("Product sold!");
                }
            }

            totalMoney = totalMoneyCard + totalMoneyCash;
            if (totalMoney >= ammount) {
                enoughMoney = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (enoughMoney) {
            double avgCash = totalMoneyCash * 1.0 / cashCounter;
            double avgCard = totalMoneyCard * 1.0 / cardCounter;

            System.out.printf("Average CS: %.2f%n", avgCash);
            System.out.printf("Average CC: %.2f", avgCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
