package A7ExamPreparation.Exam15And16June2019;

import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int movieCounter = 0;
        double maxPoints = Double.MIN_VALUE;
        String bestMovie = "";

        while (!command.equals("STOP")) {
            movieCounter++;
            double points = 0;

            for (int i = 0; i < command.length(); i++) {
                char letter = command.charAt(i);

                if (Character.isUpperCase(letter)) {
                    letter -= command.length();
                } else if (Character.isLowerCase(letter)) {
                    letter -= 2 * command.length();
                }

                points += letter;
            }
            if (points >= maxPoints) {
                maxPoints = points;
                bestMovie = command;
            }

            if (movieCounter >= 7) {
                System.out.println("The limit is reached.");
                break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %.0f ASCII sum.", bestMovie, maxPoints);
    }
}
