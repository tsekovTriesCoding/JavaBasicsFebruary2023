package A2ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 =Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double pipe1ForGivenHours = h * p1;
        double pipe2ForGivenHours = h * p2;
        double bothPipesFulled = pipe1ForGivenHours + pipe2ForGivenHours;
        double partsFulled = (v - (v - bothPipesFulled)) / v ;
        double percentFulled = partsFulled * 100;

        double percentP1 = (pipe1ForGivenHours / bothPipesFulled * 100);
        double percentP2 = (pipe2ForGivenHours / bothPipesFulled * 100);

        if (bothPipesFulled <= v) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    percentFulled, percentP1, percentP2);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",
                    h, bothPipesFulled - v);
        }
    }
}
