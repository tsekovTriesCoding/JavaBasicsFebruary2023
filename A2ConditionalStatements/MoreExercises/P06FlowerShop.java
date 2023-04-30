package A2ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactuses = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalCost = magnolias * 3.25 + hyacinths * 4 + roses * 3.5 + cactuses * 8;
        double taxes = totalCost * 0.05;
        double profit = totalCost - taxes;

        double difference = Math.abs(profit - giftPrice);

        if (profit >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(difference));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(difference));
        }
    }
}
