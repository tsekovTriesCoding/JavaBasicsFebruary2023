package A7ExamPreparation.Exam20And21April2019;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());

        int maxScore = 0;
        String winner = "";

        for (int i = 1; i <= easterBreads; i++) {
            int totalPoints = 0;
            String chefName = scanner.nextLine();
            String command = scanner.nextLine();

            while (!command.equals("Stop")) {
                int score = Integer.parseInt(command);

                totalPoints += score;

                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", chefName, totalPoints);

            if (totalPoints > maxScore) {
                maxScore = totalPoints;
                winner = chefName;
                System.out.printf("%s is the new number 1!%n", winner);
            }
        }
        System.out.printf("%s won competition with %d points!", winner, maxScore);

    }
}
