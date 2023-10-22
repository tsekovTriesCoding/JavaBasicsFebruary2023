package A7ExamPreparation.Exam28And29March2020;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kgsFoodBought = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int foodInGrams = kgsFoodBought * 1000;
        int totalFoodAte = 0;

        while (!command.equals("Adopted")) {
            int grsFoodAte = Integer.parseInt(command);

            totalFoodAte += grsFoodAte;

            command = scanner.nextLine();
        }

        int diff = Math.abs(totalFoodAte - foodInGrams);

        if (foodInGrams >= totalFoodAte) {
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }
}
