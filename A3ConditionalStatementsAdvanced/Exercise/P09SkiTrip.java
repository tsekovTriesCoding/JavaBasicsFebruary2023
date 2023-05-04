package A3ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String review = scanner.nextLine();

        double price = 0;
        int sleepNights = days - 1;

        switch (typeOfRoom) {
            case "room for one person":
                price = sleepNights * 18.00;
                break;
            case "apartment":
                price = sleepNights * 25.00;
                if (sleepNights < 10) {
                    price = price * 0.7;
                } else if (sleepNights > 10 && days <= 15) {
                    price = price * 0.65;
                } else {
                    price = price * 0.5;
                }
                break;
            case "president apartment":
                price = sleepNights * 35.00;
                if (sleepNights < 10) {
                    price = price * 0.9;
                } else if (sleepNights > 10 && days <= 15) {
                    price = price * 0.85;
                } else {
                    price = price * 0.80;
                }
                break;
        }

        if (review.equals("positive")) {
            price = price * 1.25;
        } else {
            price = price * 0.90;
        }

        System.out.printf("%.2f", price);
    }
}
