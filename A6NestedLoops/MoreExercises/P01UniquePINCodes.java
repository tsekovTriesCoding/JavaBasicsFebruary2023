package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperLimitNum1 = Integer.parseInt(scanner.nextLine());
        int upperLimitNum2 = Integer.parseInt(scanner.nextLine());
        int upperLimitNum3 = Integer.parseInt(scanner.nextLine());

        int num2counter = 0;

        for (int i = 2; i <= upperLimitNum1; i++) {
            for (int j = 2; j <= upperLimitNum2; j++) {
                for (int k = 2; k <= upperLimitNum3; k++) {
                    if ( j <= 7 && j != 4 && j != 6 && k % 2 == 0 && i % 2 == 0) {
                        System.out.printf("%d %d %d%n", i, j, k);

                    }
                }
            }
        }
    }
}
