package A3ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P05drugvariant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double totalCost = 0;

        switch (city) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        totalCost = quantity * 0.50;
                        break;
                    case "water":
                        totalCost = quantity * 0.80;
                        break;
                    case "beer":
                        totalCost = quantity * 1.20;
                        break;
                    case "sweets":
                        totalCost = quantity * 1.45;
                        break;
                    case "peanuts":
                        totalCost = quantity * 1.60;
                        break;
                }
                System.out.println(totalCost);
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        totalCost = quantity * 0.40;
                        break;
                    case "water":
                        totalCost = quantity * 0.70;
                        break;
                    case "beer":
                        totalCost = quantity * 1.15;
                        break;
                    case "sweets":
                        totalCost = quantity * 1.30;
                        break;
                    case "peanuts":
                        totalCost = quantity * 1.50;
                        break;
                }
                System.out.println(totalCost);
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        totalCost = quantity * 0.45;
                        break;
                    case "water":
                        totalCost = quantity * 0.70;
                        break;
                    case "beer":
                        totalCost = quantity * 1.10;
                        break;
                    case "sweets":
                        totalCost = quantity * 1.35;
                        break;
                    case "peanuts":
                        totalCost = quantity * 1.55;
                        break;
                }
                System.out.println(totalCost);
                break;
        }
    }
}
