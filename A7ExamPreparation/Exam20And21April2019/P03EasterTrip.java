package A7ExamPreparation.Exam20And21April2019;

import java.util.Scanner;

public class P03EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int overnightStays = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (dates.equals("21-23")) {
            if (destination.equals("France")) {
                price = 30;
            } else if (destination.equals("Italy")) {
                price = 28;
            } else if (destination.equals("Germany")) {
                price = 32;
            }

        } else if (dates.equals("24-27")) {
            if (destination.equals("France")) {
                price = 35;
            } else if (destination.equals("Italy")) {
                price = 32;
            } else if (destination.equals("Germany")) {
                price = 37;
            }
        } else if (dates.equals("28-31")) {
            if (destination.equals("France")) {
                price = 40;
            } else if (destination.equals("Italy")) {
                price = 39;
            } else if (destination.equals("Germany")) {
                price = 43;
            }
        }

        double totalCost = price * overnightStays;

        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalCost);
    }
}
