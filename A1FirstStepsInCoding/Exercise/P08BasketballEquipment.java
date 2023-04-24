package A1FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int YearTax = Integer.parseInt(scanner.nextLine());

        double Sneakers = YearTax - (YearTax * 0.4);
        double SportOutfit = Sneakers - (Sneakers * 0.2);
        double Basketball = SportOutfit / 4;
        double Accessories = Basketball / 5;

        double TotalCost = YearTax + Sneakers + SportOutfit + Basketball + Accessories;

        System.out.println(TotalCost);
    }
}
