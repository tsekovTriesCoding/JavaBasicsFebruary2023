package A5WhileLoop.Exercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double moneyInCoins = Math.round(money * 100);

        int coinCounter = 0;

        while (moneyInCoins > 0) {
            if (moneyInCoins >= 200) {
                moneyInCoins -= 200;
                coinCounter++;
            } else if (moneyInCoins >= 100) {
                moneyInCoins -= 100;
                coinCounter++;
            } else if (moneyInCoins >= 50) {
                moneyInCoins -= 50;
                coinCounter++;
            } else if (moneyInCoins >= 20) {
                moneyInCoins -= 20;
                coinCounter++;
            } else if (moneyInCoins >= 10) {
                moneyInCoins -= 10;
                coinCounter++;
            } else if (moneyInCoins >= 5) {
                moneyInCoins -= 5;
                coinCounter++;
            } else if (moneyInCoins >= 2) {
                moneyInCoins -= 2;
                coinCounter++;
            } else if (moneyInCoins >= 1) {
                moneyInCoins -= 1;
                coinCounter++;
            }
        }
        System.out.println(coinCounter);
    }
}
