package A5WhileLoop.MoreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int cleanerQuantity = 750 * bottles;
        int cycleCounter = 0;
        int cleanerNeeded = 0;
        int plates = 0;
        int pots = 0;

        boolean noMoreCleaner = false;

        while (!command.equals("End")) {
            cycleCounter++;
            int dishes = Integer.parseInt(command);

            if (cycleCounter % 3 == 0) {
                cleanerNeeded = dishes * 15;
                cleanerQuantity -= cleanerNeeded;
                pots += dishes;
            } else {
                cleanerNeeded = dishes * 5;
                cleanerQuantity -= cleanerNeeded;
                plates += dishes;
            }

            if (cleanerQuantity < 0) {
                noMoreCleaner = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (noMoreCleaner) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(cleanerQuantity));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", plates, pots);
            System.out.printf("Leftover detergent %d ml.", cleanerQuantity);
        }

    }
}
