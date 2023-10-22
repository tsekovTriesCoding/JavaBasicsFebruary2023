package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minInControl = Integer.parseInt(scanner.nextLine());
        int secInControl = Integer.parseInt(scanner.nextLine());
        double mtrsLength = Double.parseDouble(scanner.nextLine());
        int secFor100m = Integer.parseInt(scanner.nextLine());

        double totalSecInControl = minInControl * 60 + secInControl;
        double timesSlowDown = mtrsLength / 120;
        double secSlowDown = timesSlowDown * 2.5;
        double marinsTimeInSec = mtrsLength / 100 * secFor100m - secSlowDown;

        if (marinsTimeInSec <= totalSecInControl) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", marinsTimeInSec);
        } else {
            double diff = marinsTimeInSec - totalSecInControl;
            System.out.printf("No, Marin failed! He was %.3f second slower.", diff);
        }

    }
}
