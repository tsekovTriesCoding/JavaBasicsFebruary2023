package A7ExamPreparation.Exam15And16June2019;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double cost = 0;
        double totalProfit = 0;

        while (!command.equals("Movie time!")) {
            int numOfPeople = Integer.parseInt(command);

            if (hallCapacity >= numOfPeople ) {
                hallCapacity -= numOfPeople;
                cost = numOfPeople * 5;

                if (numOfPeople % 3 == 0) {
                    cost -= 5;
                }

            } else {
                System.out.println("The cinema is full.");
                break;
            }

            totalProfit += cost;

            command = scanner.nextLine();

        }
        if (command.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", hallCapacity);
        }

        System.out.printf("Cinema income - %.0f lv.", totalProfit);
    }
}
