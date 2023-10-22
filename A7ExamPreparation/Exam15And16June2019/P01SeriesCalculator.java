package A7ExamPreparation.Exam15And16June2019;

import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodeDuration = Double.parseDouble(scanner.nextLine());

        double episodeDurationWithAds = episodeDuration + 0.2 * episodeDuration;
        double totalDuration = Math.floor(episodeDurationWithAds * episodes * seasons + (seasons * 10));

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", movieName, totalDuration);

    }
}
