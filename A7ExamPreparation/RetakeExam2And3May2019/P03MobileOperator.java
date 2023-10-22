package A7ExamPreparation.RetakeExam2And3May2019;

import java.util.Scanner;

public class P03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contractLength = scanner.nextLine();
        String contractType = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double cost = 0;

        if (contractLength.equals("one")) {
            switch (contractType) {
                case "Small":
                    cost = 9.98;
                    break;
                case "Middle":
                    cost = 18.99;
                    break;
                case "Large":
                    cost = 25.98;
                    break;
                case "ExtraLarge":
                    cost = 35.99;
                    break;
            }
        } else if (contractLength.equals("two")) {
            switch (contractType) {
                case "Small":
                    cost = 8.58;
                    break;
                case "Middle":
                    cost = 17.09;
                    break;
                case "Large":
                    cost = 23.59;
                    break;
                case "ExtraLarge":
                    cost = 31.79;
                    break;
            }
        }

        if (internet.equals("yes")) {
            if (cost <= 10) {
                cost += 5.50;
            } else if (cost <= 30) {
                cost += 4.35;
            } else {
                cost += 3.85;
            }
        }
        if (contractLength.equals("two")) {
            cost = cost * 0.9625;
        }

        double totalCost = cost * months;

        System.out.printf("%.2f lv.", totalCost);
    }
}
