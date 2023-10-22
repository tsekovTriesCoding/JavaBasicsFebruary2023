package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P06BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int winCounter = 0;
        int lossCounter = 0;
        int matchCounter = 0;

        while (!command.equals("End of tournaments")) {
            String tournamentName = command;
            int matches = Integer.parseInt(scanner.nextLine());


            for (int i = 1; i <= matches; i++) {
                matchCounter++;
                int totalPoints = 0;
                int desiTeamPoints = Integer.parseInt(scanner.nextLine());
                int enemyTeamPoints = Integer.parseInt(scanner.nextLine());

                if (desiTeamPoints > enemyTeamPoints) {
                    totalPoints = desiTeamPoints - enemyTeamPoints;
                    winCounter++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, totalPoints);
                } else {
                    totalPoints = enemyTeamPoints - desiTeamPoints;
                    lossCounter++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, totalPoints);
                }

            }
            command = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", winCounter * 1.0 / matchCounter * 100);
        System.out.printf("%.2f%% matches lost", lossCounter * 1.0 / matchCounter * 100);
    }
}
