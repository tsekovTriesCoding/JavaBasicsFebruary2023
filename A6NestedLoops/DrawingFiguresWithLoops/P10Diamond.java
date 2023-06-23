package A6NestedLoops.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P10Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n - 1) / 2;
        int dashCount = 0;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= leftRight ; j++) {
                dashCount++;
            }
            System.out.print("*");

        }
    }
}
