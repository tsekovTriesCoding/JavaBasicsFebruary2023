package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P05FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());

        int backCounter = 0;
        int chestCounter = 0;
        int legsCounter = 0;
        int absCounter = 0;
        int proteinShakeCounter = 0;
        int proteinBarCounter = 0;
        int workoutCounter = 0;
        int proteinCounter = 0;

        for (int i = 1; i <= numOfPeople; i++) {
            String action = scanner.nextLine();

            if (action.equals("Back")) {
                backCounter++;
                workoutCounter++;
            } else if (action.equals("Chest")) {
                chestCounter++;
                workoutCounter++;
            } else if (action.equals("Legs")) {
                legsCounter++;
                workoutCounter++;
            } else if (action.equals("Abs")) {
                absCounter++;
                workoutCounter++;
            } else if (action.equals("Protein shake")) {
                proteinShakeCounter++;
                proteinCounter++;
            } else if (action.equals("Protein bar")) {
                proteinBarCounter++;
                proteinCounter++;
            }
        }

        System.out.printf("%d - back%n", backCounter);
        System.out.printf("%d - chest%n", chestCounter);
        System.out.printf("%d - legs%n", legsCounter);
        System.out.printf("%d - abs%n", absCounter);
        System.out.printf("%d - protein shake%n", proteinShakeCounter);
        System.out.printf("%d - protein bar%n", proteinBarCounter);
        System.out.printf("%.2f%% - work out%n", workoutCounter * 1.0 / numOfPeople * 100);
        System.out.printf("%.2f%% - protein", proteinCounter * 1.0 / numOfPeople * 100);
    }
}
