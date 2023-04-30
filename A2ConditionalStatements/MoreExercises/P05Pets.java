package A2ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int kgsFoodLeft = Integer.parseInt(scanner.nextLine());
        double kgsDogFoodADay = Double.parseDouble(scanner.nextLine());
        double kgsCatFoodADay = Double.parseDouble(scanner.nextLine());
        double gramsTurtleFoodADay = Double.parseDouble(scanner.nextLine());

        double neededDogFood = days * kgsDogFoodADay;
        double neededCatFood = days * kgsCatFoodADay;
        double neededTurtleFood = (days * gramsTurtleFoodADay) / 1000;
        double totalFoodNeeded = neededDogFood + neededCatFood + neededTurtleFood;

        double difference = Math.abs(kgsFoodLeft - totalFoodNeeded);

        if (totalFoodNeeded <= kgsFoodLeft) {
            System.out.printf("%.0f kilos of food left.", Math.floor(difference));
        }
        else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(difference));
        }
    }
}
