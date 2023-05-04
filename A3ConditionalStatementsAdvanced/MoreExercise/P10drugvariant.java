package A3ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P10drugvariant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        while (num >= 0) {
            num = 2 * num;

            System.out.printf("Result: %.2f%n", num);

            num = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Negative number!");
    }
}
