package A1FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P05SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Pens = Integer.parseInt(scanner.nextLine());
        int Markers = Integer.parseInt(scanner.nextLine());
        int LitersCleaner = Integer.parseInt(scanner.nextLine());
        int PercentDiscount = Integer.parseInt(scanner.nextLine());

        double TotalCost = Pens * 5.80 + Markers * 7.20 + LitersCleaner * 1.20;
        double TotalCostWithDiscount = TotalCost - (TotalCost * PercentDiscount / 100);

        System.out.println(TotalCostWithDiscount);
    }
}
