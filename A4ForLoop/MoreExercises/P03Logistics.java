package A4ForLoop.MoreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freightCount = Integer.parseInt(scanner.nextLine());
        int microbus = 0;
        int truck = 0;
        int train = 0;
        int totalTones = 0;
        double costmicroBus = 0;
        double costTruck = 0;
        double costTrain = 0;
        double avgPrice = 0;

        for (int i = 1; i <= freightCount ; i++) {
            int tones = Integer.parseInt(scanner.nextLine());

            if (tones <= 3) {
                microbus += tones;
                costmicroBus = 200 * microbus;
            } else if (tones <= 11) {
                truck += tones;
                costTruck = 175 * truck;
            } else {
                train += tones;
                costTrain = 120 * train;
            }
            totalTones = totalTones + tones;
        }

        avgPrice = (costmicroBus + costTruck + costTrain) / totalTones;

        System.out.printf("%.2f%n", avgPrice);
        System.out.printf("%.2f%%%n", microbus * 1.0 / totalTones * 100);
        System.out.printf("%.2f%%%n", truck * 1.0 / totalTones * 100);
        System.out.printf("%.2f%%", train * 1.0 / totalTones * 100);
    }
}
