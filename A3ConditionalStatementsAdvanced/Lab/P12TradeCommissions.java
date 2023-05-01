package A3ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double amountOfSales = Double.parseDouble(scanner.nextLine());

        double commission = 0;

        switch (city) {
            case "Sofia":
                if (amountOfSales >= 0 && amountOfSales <=500) {
                    commission = 0.05 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else if (amountOfSales >500 && amountOfSales <=1000) {
                    commission = 0.07 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else if (amountOfSales > 1000 && amountOfSales <=10000) {
                    commission = 0.08 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else if (amountOfSales > 10000) {
                    commission = 0.12 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (amountOfSales >= 0 && amountOfSales <=500) {
                    commission = 0.045 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else if (amountOfSales >500 && amountOfSales <=1000) {
                    commission = 0.075 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else if (amountOfSales > 1000 && amountOfSales <=10000) {
                    commission = 0.10 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else if (amountOfSales > 10000) {
                    commission = 0.13 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (amountOfSales >= 0 && amountOfSales <=500) {
                    commission = 0.055 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else if (amountOfSales >500 && amountOfSales <=1000) {
                    commission = 0.08 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else if (amountOfSales > 1000 && amountOfSales <=10000) {
                    commission = 0.12 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else if (amountOfSales > 10000) {
                    commission = 0.145 * amountOfSales;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
