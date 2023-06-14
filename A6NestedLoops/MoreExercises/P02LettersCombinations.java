package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String intervalStart = scanner.nextLine();
        String intervalEnd = scanner.nextLine();
        String exclude = scanner.nextLine();

        int start = intervalStart.charAt(0);
        int end = intervalEnd.charAt(0);
        int excluded = exclude.charAt(0);

        int validCount = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                for (int k = start; k <= end; k++) {
                    if (i != excluded && k != excluded && j != excluded) {
                        validCount++;
                        System.out.printf("%s%s%s ", Character.toString(i), Character.toString(j),
                                Character.toString(k));
                    }
                }
            }
        }

        System.out.println(validCount);
    }
}
