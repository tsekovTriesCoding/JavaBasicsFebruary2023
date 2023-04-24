package A1FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWallArea = x * y;
        double windowArea = 1.5 * 1.5;
        double sideWallsTotal = 2 * sideWallArea - 2 * windowArea;
        double frontAndBackWallArea = x * x;
        double entranceArea = 1.2 * 2;
        double frontAndBackTotalArea = 2 *frontAndBackWallArea - entranceArea;
        double totalSidesArea = sideWallsTotal + frontAndBackTotalArea;
        double greenPaintArea = totalSidesArea / 3.4;

        double roofRectanglesArea = 2 * x * y;
        double roofTrianglesArea = 2 * ((x * h) / 2);
        double totalRoofArea = roofRectanglesArea + roofTrianglesArea;
        double redPaintArea = totalRoofArea / 4.3;

        System.out.printf("%.2f%n%.2f", greenPaintArea, redPaintArea);
    }
}
