package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racketCost = Double.parseDouble(scanner.nextLine());
        int rackets = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());

        double sneakersCost = racketCost / 6;
        double otherEquipment = (rackets * racketCost + sneakers * sneakersCost) * 0.2;

        double totalCost = racketCost * rackets + sneakersCost
                * sneakers + otherEquipment;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(totalCost / 8));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil((totalCost * 7) / 8));
    }
}
