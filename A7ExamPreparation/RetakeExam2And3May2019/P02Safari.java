package A7ExamPreparation.RetakeExam2And3May2019;

import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litresFuelNeeded = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double fuelCost = litresFuelNeeded * 2.10;
        double costWithGuide = fuelCost + 100;

        if (day.equals("Saturday")) {
            costWithGuide = costWithGuide * 0.9;
        } else if (day.equals("Sunday")) {
            costWithGuide = costWithGuide * 0.8;
        }

        double diff = Math.abs(costWithGuide - budget);

        if (budget >= costWithGuide) {
            System.out.printf("Safari time! Money left: %.2f lv.", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }
    }
}
