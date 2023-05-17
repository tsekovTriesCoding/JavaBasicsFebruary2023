package A5WhileLoop.Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("NoMoreMoney")) {

            double currentsum = Double.parseDouble(input);
            if (currentsum < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            sum += currentsum;
            System.out.printf("Increase: %.2f\n", currentsum);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
