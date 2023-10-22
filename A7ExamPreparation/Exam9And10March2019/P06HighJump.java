package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedHeight = Integer.parseInt(scanner.nextLine());

        int currentHeight = wantedHeight - 30;
        int totalJumps = 0;
        int failCounter = 0;
        boolean fail = false;

        int currentJump = Integer.parseInt(scanner.nextLine());

        while (currentJump < wantedHeight) {
            totalJumps++;

            if (currentJump <= currentHeight) {
                failCounter++;
            }

            if (failCounter == 3) {
                fail = true;
                break;
            }

            if (currentJump > currentHeight) {
                currentHeight += 5;
                failCounter = 0;
            }

            currentJump = Integer.parseInt(scanner.nextLine());

        }
        if (fail) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, totalJumps);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currentHeight, totalJumps);
        }
    }
}
