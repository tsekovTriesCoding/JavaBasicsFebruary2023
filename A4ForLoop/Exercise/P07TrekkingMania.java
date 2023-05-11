package A4ForLoop.Exercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalPeople = 0;

        for (int i = 1; i <= numberOfGroups ; i++) {

            int numberOfPeople = Integer.parseInt(scanner.nextLine());

            if (numberOfPeople <= 5 ) {
                musala = musala + numberOfPeople;
            } else if (numberOfPeople <= 12) {
                monblan = monblan + numberOfPeople;
            } else if (numberOfPeople <= 25) {
               kilimandjaro = kilimandjaro + numberOfPeople;
            } else if (numberOfPeople <= 40) {
                k2 = k2 + numberOfPeople;
            } else {
                everest = everest + numberOfPeople;

            }
            totalPeople = totalPeople + numberOfPeople;

        }
        System.out.printf("%.2f%%%n", musala * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", monblan * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", kilimandjaro * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%", everest * 1.0 / totalPeople * 100);
    }
}
