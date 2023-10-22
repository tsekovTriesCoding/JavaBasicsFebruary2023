package A7ExamPreparation.Exam6And7July2019;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double cost = 0;

        boolean invalidInput = false;
        boolean daysZero = false;

        if (days > 7) {
            days += 1;
        }
        if (days <= 0) {
            daysZero = true;
        }

        switch (town) {
            case "Bansko":
            case "Borovets":
                if (pack.equals("noEquipment")) {
                    cost = 80 * days;
                    if (vip.equals("yes")) {
                        cost = cost * 0.95;
                    }
                } else if (pack.equals("withEquipment")) {
                    cost = 100 * days;
                    if (vip.equals("yes")) {
                        cost = cost * 0.90;
                    }
                } else {
                    invalidInput = true;
                }
                break;
            case "Varna":
            case "Burgas":
                if (pack.equals("noBreakfast")) {
                    cost = 100 * days;
                    if (vip.equals("yes")) {
                        cost = cost * 0.93;
                    }
                } else if (pack.equals("withBreakfast")) {
                    cost = 130 * days;
                    if (vip.equals("yes")) {
                        cost = cost * 0.88;
                    }
                } else {
                    invalidInput = true;
                }
                break;
            default:
                invalidInput = true;
                break;
        }

        if (invalidInput) {
            System.out.println("Invalid input!");
            if (daysZero) {
                System.out.println("Days must be positive number!");
            }
        } else if (!daysZero) {
            System.out.printf("The price is %.2flv! Have a nice time!", cost);
        } else {
            System.out.println("Days must be positive number!");
            if (invalidInput) {
                System.out.println("Invalid input!");
            }
        }
    }
}
