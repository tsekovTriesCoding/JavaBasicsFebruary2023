package A6NestedLoops.Lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int numOfComb = 0;
        int result = 0;

        boolean combFound = false;

        for (int i = intervalStart; i <= intervalEnd; i++) {
            for (int j = intervalStart; j <= intervalEnd; j++) {
                numOfComb++;

                result = i + j;

                if (result == magicNum) {
                    combFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", numOfComb, i, j, magicNum);
                    break;
                }
            }
            if (combFound) {
                break;
            }
        }
        if (!combFound) {
            System.out.printf("%d combinations - neither equals %d", numOfComb, magicNum);
        }

    }
}
