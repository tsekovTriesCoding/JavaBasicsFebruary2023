package A7ExamPreparation.Exam15And16June2019;

import java.util.Scanner;

public class P05Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        double totalPoints = academyPoints;

        for (int i = 1; i <= judges; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            totalPoints += (judgeName.length() * judgePoints) / 2;

            if (totalPoints > 1250.5) {
                break;
            }
        }

        if (totalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);

        } else {
            double diff = 1250.5 - totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }
    }
}
