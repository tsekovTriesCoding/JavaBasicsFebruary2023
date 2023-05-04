package A3ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double num = Double.parseDouble(scanner.nextLine());
            num = 2 * num;

            if (num < 0) {
                System.out.println("Negative number!");
                break;
            }
            System.out.printf("Result: %.2f%n", num);
        }
    }
}
