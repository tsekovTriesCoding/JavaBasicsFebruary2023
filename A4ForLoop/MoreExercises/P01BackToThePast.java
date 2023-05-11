package A4ForLoop.MoreExercises;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());

        double moneyLeft = inheritedMoney;
        int yearsOld = 18;

        for (int i = 1800; i <= yearToLive; i++) {

            if (i % 2 == 0) {
                moneyLeft = moneyLeft - 12000;
            } else {
                moneyLeft = moneyLeft - (12000 + 50 * yearsOld);
            }
            yearsOld++;
        }
        if (moneyLeft >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyLeft);

        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyLeft));

        }
    }
}
