package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P02FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result1 = scanner.nextLine();
        String result2 = scanner.nextLine();
        String result3 = scanner.nextLine();

        int winCounter = 0;
        int lossCounter = 0;
        int drawCounter = 0;

        if (result1.charAt(0) > result1.charAt(2)) {
            winCounter++;
        } else if (result1.charAt(0) < result1.charAt(2)) {
            lossCounter++;
        } else {
            drawCounter++;
        }

        if (result2.charAt(0) > result2.charAt(2)) {
            winCounter++;
        } else if (result2.charAt(0) < result2.charAt(2)) {
            lossCounter++;
        } else {
            drawCounter++;
        }

        if (result3.charAt(0) > result3.charAt(2)) {
            winCounter++;
        } else if (result3.charAt(0) < result3.charAt(2)) {
            lossCounter++;
        } else {
            drawCounter++;
        }

        System.out.printf("Team won %d games.%n", winCounter);
        System.out.printf("Team lost %d games.%n", lossCounter);
        System.out.printf("Drawn games: %d", drawCounter);
    }
}
