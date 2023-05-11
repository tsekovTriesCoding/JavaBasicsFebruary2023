package A4ForLoop.MoreExercises;

import java.util.Scanner;

public class P09Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i1 = 0; i1 < 24; i1++) {
            for (int i2 = 0; i2 < 60; i2++) {
                System.out.printf("%d : %d%n", i1, i2);
            }
        }

    }
}
