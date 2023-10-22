package A7ExamPreparation.Exam9And10March2019;

import java.util.Scanner;

public class P04Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String command = scanner.nextLine();

        int initialPoints = 301;
        int succesfullThrows = 0;
        int unsuccesfullThrows = 0;
        boolean win = false;

        while (!command.equals("Retire")) {
            String field = command;
            int points = Integer.parseInt(scanner.nextLine());

            if (field.equals("Triple")) {
                points = points * 3;
                if (initialPoints >= points) {
                    succesfullThrows++;
                    initialPoints -= points;
                } else {
                    unsuccesfullThrows++;
                }
            } else if (field.equals("Double")) {
                points = points * 2;
                if (initialPoints >= points) {
                    succesfullThrows++;
                    initialPoints -= points;
                } else {
                    unsuccesfullThrows++;
                }
            } else if (field.equals("Single")) {
                if (initialPoints >= points) {
                    succesfullThrows++;
                    initialPoints -= points;
                } else {
                    unsuccesfullThrows++;
                }
            }

            if (initialPoints == 0) {
                win = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (win) {
            System.out.printf("%s won the leg with %d shots.", name, succesfullThrows);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, unsuccesfullThrows);
        }
    }
}
