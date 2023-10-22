package A7ExamPreparation.Exam20And21April2019;

import java.util.Scanner;

public class P05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());

        int sugarTotal = 0;
        int flourTotal = 0;
        int maxSugarUsed = 0;
        int maxFlourUsed = 0;

        for (int i = 1; i <= easterBreads; i++) {
            int gramsSugarUsed = Integer.parseInt(scanner.nextLine());
            int gramsFlourUsed = Integer.parseInt(scanner.nextLine());

            sugarTotal += gramsSugarUsed;
            flourTotal += gramsFlourUsed;

            if (gramsSugarUsed > maxSugarUsed) {
                maxSugarUsed = gramsSugarUsed;
            }
            if (gramsFlourUsed > maxFlourUsed) {
                maxFlourUsed = gramsFlourUsed;
            }
        }

        double packsOfSugar = Math.ceil(sugarTotal * 1.0 / 950);
        double packsOfFlour = Math.ceil(flourTotal * 1.0 / 750);

        System.out.printf("Sugar: %.0f%n", packsOfSugar);
        System.out.printf("Flour: %.0f%n", packsOfFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlourUsed, maxSugarUsed);
    }
}
