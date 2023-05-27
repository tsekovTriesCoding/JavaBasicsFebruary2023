package A5WhileLoop.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int spendCount = 0;
        int daysCount = 0;
        double totalMoney = moneyAvailable;

        boolean noMoney = false;

        while (moneyNeeded > totalMoney) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")) {
                spendCount++;
                totalMoney = totalMoney - money;
                if (totalMoney < 0) {
                    totalMoney = 0;
                }
            } else if (action.equals("save")) {
                spendCount = 0;
                totalMoney = totalMoney + money;

            }

            daysCount++;

            if (spendCount == 5) {
                noMoney = true;
                break;
            }

        }

        if (noMoney) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", daysCount);
        } else {
            System.out.printf("You saved the money for %d days.", daysCount);
        }

    }
}
