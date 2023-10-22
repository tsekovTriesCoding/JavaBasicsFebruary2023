package A7ExamPreparation.Exam6And7July2019;

import java.util.Scanner;

public class P05PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int hearthstoneCounter = 0;
        int forniteCounter = 0;
        int overwatchCounter = 0;
        int othersCounter = 0;

        for (int i = 1; i <= n; i++) {
            String gameName = scanner.nextLine();

            if (gameName.equals("Hearthstone")) {
                hearthstoneCounter++;

            } else if (gameName.equals("Fornite")) {
                forniteCounter++;

            } else if (gameName.equals("Overwatch")) {
                overwatchCounter++;

            } else {
                othersCounter++;

            }
        }

        System.out.printf("Hearthstone - %.2f%%%n", hearthstoneCounter * 1.0 / n * 100);
        System.out.printf("Fornite - %.2f%%%n", forniteCounter * 1.0 / n * 100);
        System.out.printf("Overwatch - %.2f%%%n", overwatchCounter * 1.0 / n * 100);
        System.out.printf("Others - %.2f%%", othersCounter * 1.0 / n * 100);
    }
}
