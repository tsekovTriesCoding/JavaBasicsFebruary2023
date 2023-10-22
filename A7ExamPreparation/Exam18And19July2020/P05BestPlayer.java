package A7ExamPreparation.Exam18And19July2020;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxGoals = Integer.MIN_VALUE;
        String winner = "";
        boolean hatTrick = false;

        while (!command.equals("END")) {
            String player = command;
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals >= 3) {
                hatTrick = true;
            }

            if (goals > maxGoals) {
                maxGoals = goals;
                winner = player;
            }

            if (goals >= 10) {
                break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", winner);

        if (hatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }

    }
}
