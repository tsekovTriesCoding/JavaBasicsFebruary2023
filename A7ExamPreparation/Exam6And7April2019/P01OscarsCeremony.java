package A7ExamPreparation.Exam6And7April2019;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statuesCost = rent * 0.7;
        double catteringCost = statuesCost * 0.85;
        double soundingCost = catteringCost / 2;

        double totalCost = rent + statuesCost + catteringCost + soundingCost;

        System.out.printf("%.2f", totalCost);
    }
}
