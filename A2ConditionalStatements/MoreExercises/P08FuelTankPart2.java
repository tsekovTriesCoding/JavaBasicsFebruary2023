package A2ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuelAmount = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double discountCard = 0;
        double discount = 0;

        if (fuelType.equals("Gasoline")) {
            if (clubCard.equals("Yes")) {
                discountCard = 0.18;
            }
            if (fuelAmount >= 20 && fuelAmount <= 25) {
                discount = 0.08;
                } else if (fuelAmount >= 25) {
                discount = 0.1;
                }
                double totalCost = fuelAmount * (2.22 - discountCard);
                totalCost = totalCost - totalCost * discount;
            System.out.printf("%.2f lv.", totalCost);

    } else if (fuelType.equals("Diesel")) {
            if (clubCard.equals("Yes")) {
                discountCard = 0.12;
            }
            if (fuelAmount >= 20 && fuelAmount <= 25) {
                discount = 0.08;
            } else if (fuelAmount >= 25) {
                discount = 0.1;
            }
            double totalCost = fuelAmount * (2.33 - discountCard);
            totalCost = totalCost - totalCost * discount;
            System.out.printf("%.2f lv.", totalCost);

        } else if (fuelType.equals("Gas")) {
            if (clubCard.equals("Yes")) {
                discountCard = 0.08;
            }
            if (fuelAmount >= 20 && fuelAmount <= 25) {
                discount = 0.08;
            } else if (fuelAmount >= 25) {
                discount = 0.1;
            }
            double totalCost = fuelAmount * (0.93 - discountCard);
            totalCost = totalCost - totalCost * discount;
            System.out.printf("%.2f lv.", totalCost);

        }

    }
    }
