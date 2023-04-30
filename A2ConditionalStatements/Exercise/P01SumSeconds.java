package A2ConditionalStatements.Exercise;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int timeTotal = timeFirst + timeSecond + timeThird;
        int timeTotalMins = timeTotal / 60;
        int timeTotalSec = timeTotal % 60;

        if (timeTotalSec < 10) {
            System.out.printf("%d:0%d", timeTotalMins, timeTotalSec);
        } else {
            System.out.printf("%d:%d", timeTotalMins,timeTotalSec);
        }
    }
}
