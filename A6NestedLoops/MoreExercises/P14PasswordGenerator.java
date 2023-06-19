package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P14PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= l; k++) {
                    for (int m = 1; m <= l; m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k + 96, m + 96, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
