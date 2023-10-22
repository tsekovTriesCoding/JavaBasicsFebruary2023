package A7ExamPreparation.Exam15And16June2019;

import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        double moneyLeft = 0;
        boolean noMoreMoney = false;

        String command = scanner.nextLine();

        while (!command.equals("ACTION")) {
            String actorName = command;

            if (actorName.length() <= 15) {
                double actorWage = Double.parseDouble(scanner.nextLine());

                budget = budget - actorWage;
            } else {
                budget = budget * 0.8;
            }

            if (budget <= 0) {
                noMoreMoney = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (noMoreMoney) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
