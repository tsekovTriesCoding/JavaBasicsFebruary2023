package A4ForLoop.MoreExercises;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n == 2 ) {
            int sumLeftNum = 0;
            for (int i = 1; i <= n ; i++) {
                int currentNum = Integer.parseInt(scanner.nextLine());

                sumLeftNum = sumLeftNum + currentNum;
            }
            int sumRightNum = 0;
            for (int i = 1; i <= n; i++) {
                int currentNum = Integer.parseInt(scanner.nextLine());

                sumRightNum = sumRightNum + currentNum;
            }
            if (sumRightNum == sumLeftNum) {
                System.out.printf("Yes, value=%d", sumRightNum);
            } else {
                int diff = Math.abs(sumLeftNum - sumRightNum);
                System.out.printf("No, maxxdiff=%d", diff);
            }

        } else {
            int sum = 0;
            for (int i = 1; i <=n ; i++) {
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                sum = num1 + num2;

            }
            if (sum != sum) {
                int diff = sum - sum;
                System.out.printf("No, maxdiff=%d", diff);
            } else {
                System.out.printf("Yes, value=%d", sum);
            }

        }

    }
}
