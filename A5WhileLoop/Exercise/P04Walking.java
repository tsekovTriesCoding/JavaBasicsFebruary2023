package A5WhileLoop.Exercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsGoal = 10000;
        int steps = 0;

        while (steps < stepsGoal) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                steps += Integer.parseInt(scanner.nextLine());
                break;
            }

            steps += Integer.parseInt(input);

        }

        if (steps >= stepsGoal ) {
            int diff = steps - stepsGoal;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        } else {
            int diff = stepsGoal - steps;
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
