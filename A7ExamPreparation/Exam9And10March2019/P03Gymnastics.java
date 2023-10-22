package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String event = scanner.nextLine();

        double difficultyPoints = 0;
        double performancePoints = 0;

        if (country.equals("Russia")) {
            if (event.equals("ribbon")) {
                difficultyPoints = 9.100;
                performancePoints = 9.400;
            } else if (event.equals("hoop")) {
                difficultyPoints = 9.300;
                performancePoints = 9.800;
            } else if (event.equals("rope")) {
                difficultyPoints = 9.600;
                performancePoints = 9.000;
            }

        } else if (country.equals("Bulgaria")) {
            if (event.equals("ribbon")) {
                difficultyPoints = 9.600;
                performancePoints = 9.400;
            } else if (event.equals("hoop")) {
                difficultyPoints = 9.550;
                performancePoints = 9.750;
            } else if (event.equals("rope")) {
                difficultyPoints = 9.500;
                performancePoints = 9.400;
            }
        } else if (country.equals("Italy")) {
            if (event.equals("ribbon")) {
                difficultyPoints = 9.200;
                performancePoints = 9.500;
            } else if (event.equals("hoop")) {
                difficultyPoints = 9.450;
                performancePoints = 9.350;
            } else if (event.equals("rope")) {
                difficultyPoints = 9.700;
                performancePoints = 9.150;
            }
        }
        double totalPoints = difficultyPoints + performancePoints;
        double diff = 20 - totalPoints;

        System.out.printf("The team of %s get %.3f on %s.%n", country, totalPoints, event);
        System.out.printf("%.2f%%", diff / 20 * 100);
    }
}
