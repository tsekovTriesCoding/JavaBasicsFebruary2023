package A7ExamPreparation.RetakeExam2And3May2019;

import java.util.Scanner;

public class P05DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int numCounter = 0;

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            numCounter++;

            if (num % 2 == 0) {
                p1++;
            }
            if (num % 3 == 0) {
                p2++;
            }
            if (num % 4 == 0) {
                p3++;
            }

        }

        System.out.printf("%.2f%%%n", p1 * 1.0 / numCounter * 100);
        System.out.printf("%.2f%%%n", p2 * 1.0 / numCounter * 100);
        System.out.printf("%.2f%%", p3 * 1.0 / numCounter * 100);
    }
}
