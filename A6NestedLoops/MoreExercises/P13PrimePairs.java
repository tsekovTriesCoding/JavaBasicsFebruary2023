package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P13PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPairStart = Integer.parseInt(scanner.nextLine());
        int secondPairStart = Integer.parseInt(scanner.nextLine());
        int firstPairStartEndDiff = Integer.parseInt(scanner.nextLine());
        int secondPairStartEndDiff = Integer.parseInt(scanner.nextLine());


        for (int i = firstPairStart; i <= (firstPairStart + firstPairStartEndDiff); i++) {
            for (int j = secondPairStart; j <= (secondPairStart + secondPairStartEndDiff); j++) {
                int pair1PrimeCount = 0;
                for (int k = 1; k <= i; k++) {
                    if (i % k == 0) {
                        pair1PrimeCount++;
                    }
                }
                int pair2PrimeCount = 0;
                for (int l = 1; l <= j; l++) {
                    if (j % l == 0) {
                        pair2PrimeCount++;
                    }
                }
                if (pair1PrimeCount == 2 && pair2PrimeCount == 2) {
                    System.out.printf("%d%d%n", i, j);
                }
            }
        }
    }
}
