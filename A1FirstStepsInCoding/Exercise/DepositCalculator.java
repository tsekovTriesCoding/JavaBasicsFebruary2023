package A1FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Deposit = Double.parseDouble(scanner.nextLine());
        int Period = Integer.parseInt(scanner.nextLine());
        double InterestRate = Double.parseDouble(scanner.nextLine());

        double Sum = Deposit + Period *((Deposit * InterestRate / 100) / 12);

        System.out.println(Sum);
    }
}
