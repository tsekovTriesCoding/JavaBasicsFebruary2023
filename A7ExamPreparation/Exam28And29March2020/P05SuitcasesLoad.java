package A7ExamPreparation.Exam28And29March2020;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        int suitcasesLoaded = 0;
        int suitcases = 0;
        boolean noMoreSpace = false;

        while (!command.equals("End")) {
            suitcases++;
            double suitcaseVolume = Double.parseDouble(command);

            if (suitcases % 3 == 0) {
                suitcaseVolume = suitcaseVolume * 1.1;
            }
            if (suitcaseVolume <= trunkCapacity) {
                suitcasesLoaded++;

            } else {
                noMoreSpace = true;
                break;
            }

            trunkCapacity -= suitcaseVolume;

            command = scanner.nextLine();
        }

        if (noMoreSpace) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }

        System.out.printf("Statistic: %d suitcases loaded.", suitcasesLoaded);
    }
}
