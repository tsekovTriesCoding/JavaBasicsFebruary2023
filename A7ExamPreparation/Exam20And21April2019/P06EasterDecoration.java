package A7ExamPreparation.Exam20And21April2019;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double costAllClients = 0;

        for (int i = 1; i <= clients; i++) {
            int productCounter = 0;
            double totalCost = 0;

            String command = scanner.nextLine();

            while (!command.equals("Finish")) {
                String purchase = command;
                productCounter++;

                if (purchase.equals("basket")) {
                    price = 1.50;
                    totalCost += price;
                } else if (purchase.equals("wreath")) {
                    price = 3.80;
                    totalCost += price;
                } else if (purchase.equals("chocolate bunny")) {
                    price = 7;
                    totalCost += price;
                }

                command = scanner.nextLine();
            }

            if (productCounter % 2 == 0) {
                totalCost = totalCost * 0.8;
            }

            costAllClients += totalCost;

            System.out.printf("You purchased %d items for %.2f leva.%n", productCounter, totalCost);
        }

        System.out.printf("Average bill per client is: %.2f leva.", costAllClients / clients);
    }
}
