package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P09SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean matchFound = false;

        for (int i = intervalStart; i <= intervalEnd ; i++) {
            for (int j = intervalStart; j <= intervalEnd ; j++) {
                count++;

                if (i + j == magicNum) {
                    matchFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count,i, j, (i +j) );
                    break;
                }
            }
            if (matchFound) {
                break;
            }
        }
        if (!matchFound) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}
