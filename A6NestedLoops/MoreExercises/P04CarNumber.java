package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());

        for (int i = intervalStart; i <= intervalEnd; i++) {
            for (int j = intervalStart; j <= intervalEnd; j++) {
                for (int k = intervalStart; k <= intervalEnd; k++) {
                    for (int l = intervalStart; l <= intervalEnd; l++) {
                        if (i % 2 == 0 && l % 2 != 0 && i > l && (j + k) % 2 == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        } else if (i % 2 != 0 && l % 2 == 0 && i > l && (j + k) % 2 == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
