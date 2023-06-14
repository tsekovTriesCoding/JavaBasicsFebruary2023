package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P07drug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());

        boolean aReached = false;
        boolean bReached = false;

        for (int i = 35; i <= 55; i++) {
            int combinations = 0;
            for (int j = 64; j <= 96; j++) {
                for (int k = 1; k <= a; k++) {
                    for (int l = 1; l <= b; l++) {
                        if (k <= a && l <= b) {
                            System.out.printf("%c%c%d%d%c%c|", i, j, k, l, j, i);
                            combinations++;
                            i += 1;
                            j += 1;
                        }
                        if (combinations >= maxPasswords) {
                            aReached = true;
                            break;
                        } else if (k >= a && l >= b) {
                            bReached = true;
                            break;
                        }
                        if (i > 55) {
                            i = 35;
                        }
                        if (j > 96) {
                            j = 64;
                        }

                    }
                    if (aReached || bReached) {
                        break;
                    }
                }
                if (aReached || bReached) {
                    break;
                }
            }
            if (aReached || bReached) {
                break;
            }
        }
    }
}
