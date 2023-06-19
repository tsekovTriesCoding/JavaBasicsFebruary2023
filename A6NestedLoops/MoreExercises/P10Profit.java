package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P10Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coins1Leva = Integer.parseInt(scanner.nextLine());
        int coins2Leva = Integer.parseInt(scanner.nextLine());
        int coins5Leva = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= coins1Leva; i++) {
            for (int j = 0; j <= coins2Leva; j++) {
                for (int k = 0; k <= coins5Leva; k++) {
                    if (i * 1 + j * 2 + k * 5 == amount) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, amount);

                    }
                }

            }
        }
    }
}
