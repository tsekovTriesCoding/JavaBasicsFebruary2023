package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P08SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hundredsLimit = Integer.parseInt(scanner.nextLine());
        int tensLimit = Integer.parseInt(scanner.nextLine());
        int unitsLimit = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= hundredsLimit; i++) {
            for (int j = 1; j <= tensLimit; j++) {
                for (int k = 1; k <= unitsLimit; k++) {
                    int count = 0;
                    for (int l = 1; l <= j; l++) {
                        if (j % l == 0) {
                            count++;
                        }
                    }
                    if (i % 2 == 0 && k % 2 == 0 && count == 2)
                        System.out.printf("%d %d %d%n", i, j, k);

                }


            }
        }
    }
}


