package A2ConditionalStatements.Exercise;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeFor1meter = Double.parseDouble(scanner.nextLine());

        double time = distanceInMeters * timeFor1meter;
        double slow = Math.floor(distanceInMeters / 15);
        double slowingDown = slow * 12.5;
        double totalTime = time + slowingDown;

        double difference = Math.abs(totalTime - recordInSec);

        if (totalTime >= recordInSec) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
