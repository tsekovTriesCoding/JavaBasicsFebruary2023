package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P04GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();

        String command = scanner.nextLine();

        int pointsPlayer1 = 0;
        int pointsPlayer2 = 0;

        int winnerPoints = 0;
        String winner = "";
        boolean numberWars = false;

        while (!command.equals("End of game")) {
            int currentPoints = 0;
            int cardPlayer1 = Integer.parseInt(command);
            int cardPlayer2 = Integer.parseInt(scanner.nextLine());

            if (cardPlayer1 > cardPlayer2) {
                currentPoints = cardPlayer1 - cardPlayer2;
                pointsPlayer1 += currentPoints;

            } else if (cardPlayer2 > cardPlayer1) {
                currentPoints = cardPlayer2 - cardPlayer1;
                pointsPlayer2 += currentPoints;

            } else if (cardPlayer1 == cardPlayer2) {
                cardPlayer1 = Integer.parseInt(scanner.nextLine());
                cardPlayer2 = Integer.parseInt(scanner.nextLine());
                if (cardPlayer1 > cardPlayer2) {
                    winnerPoints = pointsPlayer1;
                    winner = player1;
                } else if (cardPlayer1 < cardPlayer2) {
                    winnerPoints = pointsPlayer2;
                    winner = player2;
                }
                numberWars = true;
                break;
            }

            command = scanner.nextLine();

        }

        if (numberWars) {
            System.out.println("Number wars!");
            System.out.printf("%s is winner with %d points", winner, winnerPoints);
        } else {
            System.out.printf("%s has %d points%n", player1, pointsPlayer1);
            System.out.printf("%s has %d points", player2, pointsPlayer2);
        }
    }
}
