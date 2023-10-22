package A7ExamPreparation.Exam6And7April2019;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int studentCounter = 0;
        int standardCounter = 0;
        int kidCounter = 0;
        int totalTicketsCounter = 0;

        while (!name.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int currentTicketCounter = 0;

            String ticketType = scanner.nextLine();

            while (!ticketType.equals("End")) {
                currentTicketCounter++;
                totalTicketsCounter++;

                switch (ticketType) {
                    case "student":
                        studentCounter++;
                        break;
                    case "standard":
                        standardCounter++;
                        break;
                    case "kid":
                        kidCounter++;
                        break;
                }
                if (freeSeats <= currentTicketCounter) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", name, currentTicketCounter * 1.0 / freeSeats * 100);

            name = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTicketsCounter);
        System.out.printf("%.2f%% student tickets.%n", studentCounter * 1.0 / totalTicketsCounter * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCounter * 1.0 / totalTicketsCounter * 100);
        System.out.printf("%.2f%% kids tickets.", kidCounter * 1.0 / totalTicketsCounter * 100);
    }
}
