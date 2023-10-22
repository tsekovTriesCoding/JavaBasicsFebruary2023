package A7ExamPreparation.Exam20And21April2019;

import java.util.Scanner;

public class P03PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggSize = scanner.nextLine();
        String eggColour = scanner.nextLine();
        int packs = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (eggSize.equals("Large")) {
            switch (eggColour) {
                case "Red":
                    price = 16;
                    break;
                case "Green":
                    price = 12;
                    break;
                case "Yellow":
                    price = 9;
                    break;
            }

        } else if (eggSize.equals("Medium")) {
            switch (eggColour) {
                case "Red":
                    price = 13;
                    break;
                case "Green":
                    price = 9;
                    break;
                case "Yellow":
                    price = 7;
                    break;
            }
        } else if (eggSize.equals("Small")) {
            switch (eggColour) {
                case "Red":
                    price = 9;
                    break;
                case "Green":
                    price = 8;
                    break;
                case "Yellow":
                    price = 5;
                    break;
            }
        }

        double profit = packs * price;
        double productionCosts = profit * 0.35;
        double totalProfit = profit - productionCosts;

        System.out.printf("%.2f leva.", totalProfit);
    }
}
