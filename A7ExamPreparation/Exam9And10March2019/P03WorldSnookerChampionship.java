package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentStage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        String photo = scanner.nextLine();

        double ticketPrice = 0;

        if (tournamentStage.equals("Quarter final")) {
            switch (ticketType) {
                case "Standard":
                    ticketPrice = 55.5;
                    break;
                case "Premium":
                    ticketPrice = 105.2;
                    break;
                case "VIP":
                    ticketPrice = 118.9;
                    break;
            }

        } else if (tournamentStage.equals("Semi final")) {
            switch (ticketType) {
                case "Standard":
                    ticketPrice = 75.88;
                    break;
                case "Premium":
                    ticketPrice = 125.22;
                    break;
                case "VIP":
                    ticketPrice = 300.4;
                    break;
            }

        } else if (tournamentStage.equals("Final")) {
            switch (ticketType) {
                case "Standard":
                    ticketPrice = 110.10;
                    break;
                case "Premium":
                    ticketPrice = 160.66;
                    break;
                case "VIP":
                    ticketPrice = 400;
                    break;
            }
        }

        double totalPrice = ticketPrice * tickets;

        if (totalPrice > 4000) {
            totalPrice = totalPrice * 0.75;
        } else if (totalPrice > 2500) {
            totalPrice = totalPrice * 0.9;
            if (photo.equals("Y")) {
                totalPrice += tickets * 40;
            }
        } else if (totalPrice <= 2500){
            if (photo.equals("Y")) {
                totalPrice += tickets * 40;
            }
        }

        System.out.printf("%.2f", totalPrice);
    }
}
