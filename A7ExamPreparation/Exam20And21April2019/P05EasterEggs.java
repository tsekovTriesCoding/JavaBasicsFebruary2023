package A7ExamPreparation.Exam20And21April2019;

import java.util.Scanner;

public class P05EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintedEggs = Integer.parseInt(scanner.nextLine());

        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;
        int maxEggs = Integer.MIN_VALUE;
        String winnerColour = "";

        for (int i = 1; i <= paintedEggs; i++) {
            String eggColour = scanner.nextLine();
            if (eggColour.equals("red")) {
                redEggs++;
                if (redEggs > maxEggs) {
                    maxEggs = redEggs;
                    winnerColour = eggColour;
                }

            } else if (eggColour.equals("orange")) {
                orangeEggs++;
                if (orangeEggs > maxEggs) {
                    maxEggs = orangeEggs;
                    winnerColour = eggColour;
                }

            } else if (eggColour.equals("blue")) {
                blueEggs++;
                if (blueEggs > maxEggs) {
                    maxEggs = blueEggs;
                    winnerColour = eggColour;
                }

            } else if (eggColour.equals("green")) {
                greenEggs++;
                if (greenEggs > maxEggs) {
                    maxEggs = greenEggs;
                    winnerColour = eggColour;
                }

            }
        }
        System.out.printf("Red eggs: %d%n", redEggs);
        System.out.printf("Orange eggs: %d%n", orangeEggs);
        System.out.printf("Blue eggs: %d%n", blueEggs);
        System.out.printf("Green eggs: %d%n", greenEggs);
        System.out.printf("Max eggs: %d -> %s", maxEggs, winnerColour);
    }
}
