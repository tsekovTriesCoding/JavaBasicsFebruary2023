package A6NestedLoops.Exercises;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        int allTicketsCounter = 0;
        int studentTicket = 0;
        int standardTicket = 0;
        int kidTicket = 0;

        while (!command.equals("Finish")) {
            String movieName = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int currentTicketsCounter = 0;

            String ticket = scanner.nextLine();
            while (!ticket.equals("End")) {
                double percentFull = 0;
                currentTicketsCounter++;
                allTicketsCounter++;

                if (ticket.equals("student")) {
                    studentTicket++;
                } else if (ticket.equals("standard")) {
                    standardTicket++;
                } else if (ticket.equals("kid")) {
                    kidTicket++;
                }

                if (currentTicketsCounter >= freeSeats) {
                    break;
                }

                ticket = scanner.nextLine();

            }
            System.out.printf("%s - %.2f%% full.%n", movieName, currentTicketsCounter * 1.0 / freeSeats * 100);

            command = scanner.nextLine();

        }
        System.out.printf("Total tickets: %d%n", allTicketsCounter);
        System.out.printf("%.2f%% student tickets.%n", studentTicket * 1.0 / allTicketsCounter * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTicket * 1.0 / allTicketsCounter * 100);
        System.out.printf("%.2f%% kids tickets.", kidTicket * 1.0 / allTicketsCounter * 100);
    }
}
