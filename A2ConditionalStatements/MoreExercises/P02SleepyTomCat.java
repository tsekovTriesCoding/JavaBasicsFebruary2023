package A2ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOff = Integer.parseInt(scanner.nextLine());

        double playTimeNorm = 30000;

        double daysOffPlaying = daysOff * 127;
        double workDaysPlaying =  (365 - daysOff) * 63;
        double totalPlayTime = daysOffPlaying + workDaysPlaying;
        double difference = Math.abs(playTimeNorm - totalPlayTime);
        double differenceInHours = Math.floor(difference / 60);
        double differenceInMins = difference % 60;

        if (totalPlayTime > playTimeNorm) {
            System.out.printf("Tom will run away%n%.0f hours and %.0f minutes more for play",
                    differenceInHours, differenceInMins);
        } else {
            System.out.printf("Tom sleeps well%n%.0f hours and %.0f minutes less for play",
                    differenceInHours, differenceInMins);
        }
    }
}
