package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basketballTax = Integer.parseInt(scanner.nextLine());

        double sneakers = basketballTax * 0.6;
        double clothes = sneakers * 0.8;
        double ball = clothes / 4;
        double accessories = ball / 5;
        double totalCost = basketballTax + sneakers + clothes + ball + accessories;

        System.out.printf("%.2f", totalCost);
    }
}
