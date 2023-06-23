package A6NestedLoops.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P08Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int upperRow = 1; upperRow <= 2 * n; upperRow++) {
            System.out.print("*");
        }
        for (int j = 1; j <= n; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * n; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int midRow = 0; midRow < n - 2; midRow++) {
            System.out.print("*");
            for (int m = 1; m <= 2 * n - 2; m++) {
                System.out.print("/");
            }
            System.out.print("*");
            if (midRow == (n - 1) / 2 - 1) {
                for (int k = 1; k <= n; k++) {
                    System.out.print("|");
                }
            } else {
                for (int l = 1; l <= n; l++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for (int m = 1; m <= 2 * n - 2; m++) {
                System.out.print("/");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int lowerRow = 1; lowerRow <= 2 * n; lowerRow++) {
            System.out.print("*");
        }
        for (int j = 1; j <= n; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * n; j++) {
            System.out.print("*");
        }

    }
}
