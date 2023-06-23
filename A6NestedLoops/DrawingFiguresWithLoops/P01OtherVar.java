package A6NestedLoops.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P01OtherVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
