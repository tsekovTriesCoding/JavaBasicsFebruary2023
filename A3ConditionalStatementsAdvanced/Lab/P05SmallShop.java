package A3ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double totalCost = 0;

        switch (city) {
            case "Sofia":
                if (product.equals("coffee")) {
                    totalCost = quantity * 0.50;
                } else if (product.equals("water")) {
                    totalCost = quantity * 0.80;
                } else if (product.equals("beer")) {
                    totalCost = quantity * 1.20;
                } else if (product.equals("sweets")) {
                    totalCost = quantity * 1.45;
                } else if (product.equals("peanuts")) {
                    totalCost = quantity * 1.60;
                }
                System.out.println(totalCost);
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    totalCost = quantity * 0.40;
                } else if (product.equals("water")) {
                    totalCost = quantity * 0.70;
                } else if (product.equals("beer")) {
                    totalCost = quantity * 1.15;
                } else if (product.equals("sweets")) {
                    totalCost = quantity * 1.30;
                } else if (product.equals("peanuts")) {
                    totalCost = quantity * 1.50;
                }
                System.out.println(totalCost);
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    totalCost = quantity * 0.45;
                } else if (product.equals("water")) {
                    totalCost = quantity * 0.70;
                } else if (product.equals("beer")) {
                    totalCost = quantity * 1.10;
                } else if (product.equals("sweets")) {
                    totalCost = quantity * 1.35;
                } else if (product.equals("peanuts")) {
                    totalCost = quantity * 1.55;
                }
                System.out.println(totalCost);
                break;
        }
    }
}
