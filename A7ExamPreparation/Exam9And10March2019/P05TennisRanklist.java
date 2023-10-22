package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P05TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfTournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int sumPoints = 0;
        int totalPoints = initialPoints;
        int winCounter = 0;

        for (int i = 1; i <= numOfTournaments; i++) {
            String tournamentStage = scanner.nextLine();

            switch (tournamentStage) {
                case "W":
                    winCounter++;
                    points = 2000;
                    break;
                case "F":
                    points = 1200;
                    break;
                case "SF":
                    points = 720;
                    break;
            }
            sumPoints += points;
            totalPoints = totalPoints +  points;
        }
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(sumPoints * 1.0 / numOfTournaments));
        System.out.printf("%.2f%%", winCounter * 1.0 / numOfTournaments * 100);
    }
}
