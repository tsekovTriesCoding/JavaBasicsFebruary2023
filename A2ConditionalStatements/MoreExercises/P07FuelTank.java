package A2ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P07FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuelLitres = Double.parseDouble(scanner.nextLine());

        if (fuelType.equals("Diesel")) {
            if (fuelLitres >=25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
    } else if (fuelType.equals("Gasoline")) {
            if (fuelLitres >=25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        } else if (fuelType.equals("Gas")){
            if (fuelLitres >=25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }

        }
    }
