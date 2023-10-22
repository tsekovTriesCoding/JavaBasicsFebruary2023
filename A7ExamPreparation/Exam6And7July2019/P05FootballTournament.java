package A7ExamPreparation.Exam6And7July2019;

import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int matches = Integer.parseInt(scanner.nextLine());

        boolean zeroMatches = false;

        int winCount = 0;
        int lossCount = 0;
        int drawCount = 0;
        int winPoints = 0;
        int drawPoints = 0;

        int totalPoints = 0;

        for (int i = 1; i <= matches; i++) {
            String outcome = scanner.nextLine();


            switch (outcome) {
                case "W":
                    winCount++;
                    winPoints = winCount * 3;
                    break;
                case "D":
                    drawCount++;
                    drawPoints = drawCount * 1;
                    break;
                case "L":
                    lossCount++;
                    break;

            }

            totalPoints = drawPoints + winPoints;
        }

        if (matches >= 1) {
            System.out.printf("%s has won %d points during this season.%n", teamName, totalPoints);
            System.out.printf("Total stats:%n");
            System.out.printf("## W: %d%n", winCount);
            System.out.printf("## D: %d%n", drawCount);
            System.out.printf("## L: %d%n", lossCount);
            System.out.printf("Win rate: %.2f%%", winCount * 1.0 / matches * 100);
        } else {
            System.out.printf("%s hasn't played any games during this season.", teamName);
        }
    }
}
