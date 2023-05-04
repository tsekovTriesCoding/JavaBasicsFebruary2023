package A3ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());

        double transportCost = 0;

        if (peopleCount >= 1 && peopleCount <= 4) {
            transportCost = budget * 0.75;
        } else if (peopleCount >= 5 && peopleCount <= 9) {
            transportCost = budget * 0.60;
        } else if (peopleCount >= 10 && peopleCount <=24) {
            transportCost = budget * 0.50;
        } else if ( peopleCount >= 25 && peopleCount <= 49) {
            transportCost = budget * 0.40;
        } else if (peopleCount > 50) {
            transportCost = budget * 0.25;
        }

        double diff = budget - transportCost;
        double ticketCost = 0;

        switch (category) {
            case "VIP":
                ticketCost = 499.99 * peopleCount ;
                if (ticketCost < diff) {
                    diff = diff - ticketCost;
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    diff = ticketCost - diff;
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
                break;
            case "Normal":
                ticketCost = 249.99 * peopleCount ;
                if (ticketCost < diff) {
                    diff = diff - ticketCost;
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    diff = ticketCost - diff;
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            break;
        }


    }
}
