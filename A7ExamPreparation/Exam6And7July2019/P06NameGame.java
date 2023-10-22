package A7ExamPreparation.Exam6And7July2019;

import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int maxPoints = 0;
        String winner = "";

        while (!command.equals("Stop")) {
            int currentPoints = 0;
            String name = command;

            for (int i = 0; i < name.length(); i++) {

                int n = Integer.parseInt(scanner.nextLine());

                int asciiValue = name.charAt(i);

                if (n == asciiValue) {
                    currentPoints += 10;
                } else {
                    currentPoints += 2;
                }
            }
            if (currentPoints >= maxPoints) {
                maxPoints = currentPoints;
                winner = name;
            }

            command = scanner.nextLine();

        }
        System.out.printf("The winner is %s with %d points!", winner, maxPoints);
    }
}
