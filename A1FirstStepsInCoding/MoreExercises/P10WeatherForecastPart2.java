package A1FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());

        if (degrees <= 35.00) if (degrees >=26.00) {
            System.out.println("Hot");
        }
        if (degrees <= 25.9) if (degrees >=20.1) {
            System.out.println("Warm");
        }
        if (degrees <=20.00) if (degrees >= 15.00) {
            System.out.println("Mild");
        }
        if (degrees <= 14.9) if (degrees >=12.00) {
            System.out.println("Cool");
        }
        if (degrees <= 11.9) if (degrees >= 5.00) {
            System.out.println("Cold");
        }
        else {
            System.out.println("unknown");
        }
    }
}
