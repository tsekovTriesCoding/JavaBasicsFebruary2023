package A7ExamPreparation.RetakeExam2And3May2019;

import java.util.Scanner;

public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasQty = Double.parseDouble(scanner.nextLine());
        double orangesQty = Double.parseDouble(scanner.nextLine());
        double raspberriesQty = Double.parseDouble(scanner.nextLine());
        double strawberriesQty = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice * 0.5;
        double orangesPrice = raspberriesPrice * 0.6;
        double bananasPrice = raspberriesPrice * 0.2;

        double totalCost = strawberriesPrice * strawberriesQty + bananasPrice * bananasQty +
                orangesPrice * orangesQty + raspberriesPrice * raspberriesQty;

        System.out.printf("%.2f", totalCost);

    }
}
