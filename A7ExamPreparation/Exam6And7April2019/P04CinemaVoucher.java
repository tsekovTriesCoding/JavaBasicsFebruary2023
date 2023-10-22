package A7ExamPreparation.Exam6And7April2019;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherValue = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int cost = 0;
        int ticketCounter = 0;
        int othersCounter = 0;

        while (!command.equals("End")) {
            char letter1 = command.charAt(0);
            char letter2 = command.charAt(1);

            if (command.length() > 8) {
                cost = letter1 + letter2;
                if (cost <= voucherValue) {
                    ticketCounter++;
                }

            } else {
                cost = letter1;
                if (cost <= voucherValue) {
                    othersCounter++;
                }
            }

            if (cost >= voucherValue) {
                break;
            }

            voucherValue -= cost;

            command = scanner.nextLine();
        }
        System.out.println(ticketCounter);
        System.out.println(othersCounter);
    }
}
