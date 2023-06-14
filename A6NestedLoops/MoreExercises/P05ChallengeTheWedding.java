package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maleClients = Integer.parseInt(scanner.nextLine());
        int femaleClients = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());

        int maleCounter = 0;
        int femaleCounter = 0;

        while (maxTables > 0) {

            for (int i = 1; i <= maleClients; i++) {
                for (int j = 1; j <= femaleClients; j++) {
                    maleCounter++;
                    femaleCounter++;

                    if (maxTables == 0) {
                        break;
                    }

                    System.out.printf("(%d <-> %d) ", i, j);

                    maxTables--;
                }
            }

            if (maleCounter > maleClients || femaleCounter > femaleClients) {
                break;
            }

            maxTables--;
        }

    }
}
