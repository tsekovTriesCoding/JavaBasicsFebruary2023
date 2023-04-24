package A1FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Nylon = Integer.parseInt(scanner.nextLine());
        int Paint = Integer.parseInt(scanner.nextLine());
        int PaintSolvent = Integer.parseInt(scanner.nextLine());
        int Hoursneeded = Integer.parseInt(scanner.nextLine());

        double MorePaint = Paint + (Paint * 0.1);

        double Cost = (Nylon + 2) * 1.50 + MorePaint * 14.50 + PaintSolvent * 5.00;
        double CostMaterials = Cost + 0.40;
        double CostForWorkers = CostMaterials * 0.3;

        double TotalCost = CostMaterials + (CostForWorkers * Hoursneeded);

        System.out.println(TotalCost);
    }
}
