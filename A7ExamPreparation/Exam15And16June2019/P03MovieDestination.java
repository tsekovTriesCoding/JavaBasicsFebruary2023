package A7ExamPreparation.Exam15And16June2019;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double cost = 0;

        if (destination.equals("Dubai")) {
            if (season.equals("Winter")) {
                cost = 45000 * days;
            } else if (season.equals("Summer")) {
                cost = 40000 * days;
            }

        } else if (destination.equals("Sofia")) {
            if (season.equals("Winter")) {
                cost = 17000 * days;
            } else if (season.equals("Summer")) {
                cost = 12500 * days;
            }
        } else if (destination.equals("London")) {
            if (season.equals("Winter")) {
                cost = 24000 * days;
            } else if (season.equals("Summer")) {
                cost = 20250 * days;
            }
        }
        if (destination.equals("Dubai")) {
            cost = cost * 0.7;
        } else if (destination.equals("Sofia")) {
            cost = cost * 1.25;
        }

        double diff = Math.abs(movieBudget - cost);

        if (movieBudget >= cost) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }
    }
}
