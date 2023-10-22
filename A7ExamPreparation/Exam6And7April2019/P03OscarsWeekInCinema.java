package A7ExamPreparation.Exam6And7April2019;

import java.util.Scanner;

public class P03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String hallType = scanner.nextLine();
        int ticketsBought = Integer.parseInt(scanner.nextLine());

        double totalCost = 0;

        if (movie.equals("A Star Is Born")) {
            switch (hallType) {
                case "normal":
                    totalCost = ticketsBought * 7.50;
                    break;
                case "luxury":
                    totalCost = ticketsBought * 10.50;
                    break;
                case "ultra luxury":
                    totalCost = ticketsBought * 13.50;
                    break;
            }

        } else if (movie.equals("Bohemian Rhapsody")) {
            switch (hallType) {
                case "normal":
                    totalCost = ticketsBought * 7.35;
                    break;
                case "luxury":
                    totalCost = ticketsBought * 9.45;
                    break;
                case "ultra luxury":
                    totalCost = ticketsBought * 12.75;
                    break;
            }

        } else if (movie.equals("Green Book")) {
            switch (hallType) {
                case "normal":
                    totalCost = ticketsBought * 8.15;
                    break;
                case "luxury":
                    totalCost = ticketsBought * 10.25;
                    break;
                case "ultra luxury":
                    totalCost = ticketsBought * 13.25;
                    break;
            }

        } else if (movie.equals("The Favourite")) {
            switch (hallType) {
                case "normal":
                    totalCost = ticketsBought * 8.75;
                    break;
                case "luxury":
                    totalCost = ticketsBought * 11.55;
                    break;
                case "ultra luxury":
                    totalCost = ticketsBought * 13.95;
                    break;
            }

        }

        System.out.printf("%s -> %.2f lv.", movie, totalCost);
    }
}
