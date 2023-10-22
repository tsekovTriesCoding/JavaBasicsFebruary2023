package A7ExamPreparation.Exam6And7April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movies = Integer.parseInt(scanner.nextLine());

        double maxRating = Integer.MIN_VALUE;
        double minRating = Integer.MAX_VALUE;
        double totalRating = 0;
        String bestMovie = "";
        String worstMovie = "";

        for (int i = 1; i <= movies; i++) {
            String name = scanner.nextLine();
            ;
            double rating = Double.parseDouble(scanner.nextLine());

            totalRating += rating;

            if (rating > maxRating) {
                maxRating = rating;
                bestMovie = name;
            } else if (rating < minRating) {
                minRating = rating;
                worstMovie = name;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", bestMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", worstMovie, minRating);
        System.out.printf("Average rating: %.1f", totalRating / movies);
    }
}
