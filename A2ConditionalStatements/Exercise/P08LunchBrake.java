package A2ConditionalStatements.Exercise;

import java.util.Scanner;

public class P08LunchBrake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime / 8.0;
        double relaxTime = breakTime / 4.0;
        double freeTime = breakTime - lunchTime - relaxTime;

        if (freeTime >= episodeTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time."
                    , movie, Math.ceil(freeTime - episodeTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes."
                    , movie, Math.ceil(episodeTime - freeTime));
        }
    }
}
