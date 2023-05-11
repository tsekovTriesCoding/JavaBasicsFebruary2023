package A4ForLoop.MoreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int turnCount = Integer.parseInt(scanner.nextLine());
        int zeroToNine = 0;
        int toNineteen = 0;
        int toTwentyNine = 0;
        int toThirtyNine = 0;
        int toFortyNine = 0;
        int invalid = 0;
        double result = 0;
        double totalNumbers = 0;

        for (int i = 1; i <= turnCount; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                zeroToNine++;
                result = result + 0.2 * number;
            } else if (number > 9 && number <= 19) {
                toNineteen++;
                result = result + 0.3 * number;
            } else if (number > 19 && number <= 29) {
                toTwentyNine++;
                result = result + 0.4 * number;
            } else if (number > 29 && number <= 39) {
                toThirtyNine++;
                result = result + 50;
            } else if (number > 39 && number <= 50) {
                toFortyNine++;
                result = result + 100;
            } else {
                invalid++;
                result = result / 2;
            }

            totalNumbers = zeroToNine + toNineteen + toTwentyNine + toThirtyNine + toFortyNine + invalid;

        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", zeroToNine / totalNumbers * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", toNineteen / totalNumbers * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", toTwentyNine / totalNumbers * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", toThirtyNine / totalNumbers * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", toFortyNine / totalNumbers * 100);
        System.out.printf("Invalid numbers: %.2f%%", invalid / totalNumbers * 100);
    }
}
