package A4ForLoop.Exercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentCount = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        double totalPoints = 0;
        int winCount = 0;

        for (int i = 1; i <= tournamentCount ; i++) {
            String tournamentStage = scanner.nextLine();

            if (tournamentStage.equals("W")) {
                winCount ++;
                if (i == 1){
                    points = points + 2000 + initialPoints;
                } else {
                    points = points + 2000;
                }

            } else if (tournamentStage.equals("F")) {
                if (i == 1){
                    points = points + 1200 + initialPoints;
                } else {
                    points = points + 1200;
                }
            } else if (tournamentStage.equals("SF")) {
                if (i == 1){
                    points = points + 720 + initialPoints;
                } else {
                    points = points + 720;
                }
            }
        }
        totalPoints = totalPoints + points;
        double avgPoints = Math.floor((totalPoints - initialPoints * 1.0) / tournamentCount);
        double winPercent = winCount * 1.0 / tournamentCount * 100;

        System.out.printf("Final points: %.0f%n", totalPoints);
        System.out.printf("Average points: %.0f%n", avgPoints);
        System.out.printf("%.2f%%", winPercent);

    }
}
