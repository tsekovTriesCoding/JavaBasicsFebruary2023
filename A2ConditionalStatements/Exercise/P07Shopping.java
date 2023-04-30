package A2ConditionalStatements.Exercise;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double petersBudget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videocardsCost = videocards * 250;
        double processorsCost = (videocardsCost * 0.35) * processors;
        double ramCost = (videocardsCost * 0.1) * ram;

        double totalcost = videocardsCost + processorsCost + ramCost;

        if (videocards > processors) {
             totalcost = totalcost - totalcost * 0.15;
        }
        double difference = Math.abs(petersBudget - totalcost);

        if (petersBudget >= totalcost) {
            System.out.printf("You have %.2f leva left!", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }
    }
}
