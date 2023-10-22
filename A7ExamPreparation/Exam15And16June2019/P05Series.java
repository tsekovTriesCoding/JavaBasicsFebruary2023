package A7ExamPreparation.Exam15And16June2019;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numOfMovies = Integer.parseInt(scanner.nextLine());

        double totalCost = 0;

        for (int i = 1; i <= numOfMovies; i++) {
            String movieName = scanner.nextLine();
            double moviePrice = Double.parseDouble(scanner.nextLine());

            if (movieName.equals("Thrones")) {
                moviePrice = moviePrice * 0.5;
            } else if (movieName.equals("Lucifer")) {
                moviePrice = moviePrice * 0.6;
            } else if (movieName.equals("Protector")) {
                moviePrice = moviePrice * 0.7;
            } else if (movieName.equals("TotalDrama")) {
                moviePrice = moviePrice * 0.8;
            } else if (movieName.equals("Area")) {
                moviePrice = moviePrice * 0.9;
            }

            totalCost = totalCost + moviePrice;
        }

        double diff = Math.abs(totalCost - budget);

        if (budget >= totalCost) {
            System.out.printf("You bought all the series and left with %.2f lv.", diff);

        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", diff);
        }
    }
}
