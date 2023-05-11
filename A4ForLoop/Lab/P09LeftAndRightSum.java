package A4ForLoop.Lab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

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
            System.out.printf("Yes, sum = %d", sumRightNum);
        } else {
            int diff = Math.abs(sumLeftNum - sumRightNum);
            System.out.printf("No, diff = %d", diff);
        }


    }
}
