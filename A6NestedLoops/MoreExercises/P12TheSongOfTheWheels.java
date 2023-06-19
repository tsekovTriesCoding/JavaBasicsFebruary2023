package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P12TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean fourthNumFound = false;
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        int d1 = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d && ((a * b + c * d) == controlNum)) {
                            counter++;
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                        }
                        if (counter == 4) {
                            fourthNumFound = true;
                            a1 = a;
                            b1 = b;
                            c1 = c;
                            d1 = d;
                            counter = 0;
                        }
                    }
                }
                if (fourthNumFound) {
                    counter = 0;
                }
            }
            if (fourthNumFound) {
                counter = 0;
            }
        }

        System.out.println();
        if (fourthNumFound) {
            System.out.printf("Password: %d%d%d%d ", a1, b1, c1, d1);
        } else {
            System.out.println("No!");
        }

    }
}
