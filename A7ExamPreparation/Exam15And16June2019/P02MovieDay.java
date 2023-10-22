package A7ExamPreparation.Exam15And16June2019;

import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int sceneTime = Integer.parseInt(scanner.nextLine());

        double terrainPreparation = time * 0.15;
        int timeNeededForScenes = scenes * sceneTime;
        double totalTimeNeeded = terrainPreparation + timeNeededForScenes;

        double diff = Math.abs(totalTimeNeeded - time);

        if (totalTimeNeeded <= time) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", diff);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", diff);
        }
    }
}
