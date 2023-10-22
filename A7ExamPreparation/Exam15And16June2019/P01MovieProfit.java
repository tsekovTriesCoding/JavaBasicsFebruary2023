package A7ExamPreparation.Exam15And16June2019;

import java.util.Scanner;

public class P01MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentProfitCinema = Integer.parseInt(scanner.nextLine());

        double profit = days * tickets * ticketPrice;
        double profitForCinema = profit * percentProfitCinema / 100;
        double movieProfit = profit - profitForCinema;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, movieProfit);
    }
}
