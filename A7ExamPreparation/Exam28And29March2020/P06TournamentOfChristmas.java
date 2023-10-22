package A7ExamPreparation.Exam28And29March2020;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0;
        int totalWins = 0;
        int totalLosses = 0;

        for (int i = 1; i <= days; i++) {
            double moneyWon = 0;
            String command = scanner.nextLine();
            int winCount = 0;
            int lossCount = 0;

            while (!command.equals("Finish")) {

                String sport = command;
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    winCount++;
                    totalWins++;
                    moneyWon += 20;
                } else if (result.equals("lose")) {
                    lossCount++;
                    totalLosses++;
                }

                command = scanner.nextLine();
            }

            if (winCount > lossCount) {
                moneyWon = moneyWon * 1.1;
            }

            totalMoney += moneyWon;

        }
        if (totalWins > totalLosses) {
            totalMoney = totalMoney * 1.20;
        }

        if (totalWins > totalLosses) {
            System.out.printf("You won the tournament! Total raised money: %.2f%n", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
