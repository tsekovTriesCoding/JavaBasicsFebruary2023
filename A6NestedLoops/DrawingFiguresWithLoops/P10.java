package A6NestedLoops.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n - 1) / 2;
        int upperRow = n / 2 + 1;

        if (n % 2 == 0) {
            upperRow = n / 2;
        }

        for (int i = 1; i <= upperRow; i++) {
            System.out.print("-".repeat(leftRight));
            System.out.print("*");

            int mid = n - 2 * leftRight - 2;
            if (mid >= 0) {
                System.out.print("-".repeat(mid));
                System.out.print("*");
            }
            System.out.println("-".repeat(leftRight));
            leftRight--;
        }

        if (leftRight < 0) {
            leftRight = 0;
        }

        for (int i = 0; i < (n - 1) / 2; i++) {
            leftRight++;
            System.out.print("-".repeat(leftRight));
            System.out.print("*");

            int mid = n - 2 * leftRight - 2;
            if (mid >= 0) {
                System.out.print("-".repeat(mid));
                System.out.print("*");
            }

            System.out.println("-".repeat(leftRight));
        }
    }
}
