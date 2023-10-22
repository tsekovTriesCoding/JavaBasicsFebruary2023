package A7ExamPreparation.Exam6And7July2019;

import java.util.Scanner;

public class P06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double maxPoints = 0;

        String winningWord = "";

        while (!command.equals("End of words")) {
            int currentPoints = 0;
            char letter = command.charAt(0);
            for (int i = 0; i < command.length(); i++) {
                currentPoints += command.charAt(i);

            }
            switch (letter) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'u':
                case 'U':
                case 'i':
                case 'I':
                case 'y':
                case 'Y':
                case 'o':
                case 'O':
                    currentPoints = currentPoints * command.length();
                    break;
                default:
                    currentPoints = currentPoints / command.length();
            }

            if (currentPoints > maxPoints) {
                maxPoints = currentPoints;
                winningWord = command;
            }

            command = scanner.nextLine();

        }
        System.out.printf("The most powerful word is %s - %.0f", winningWord, maxPoints);

    }
}
