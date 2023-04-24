package A1FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double buros = Math.floor((h * 100 - 100) / 70);
        double rows = Math.floor(w * 100 / 120);
        double workingPlaces = buros * rows - 3;

        System.out.printf("%.0f", workingPlaces);
    }
}
