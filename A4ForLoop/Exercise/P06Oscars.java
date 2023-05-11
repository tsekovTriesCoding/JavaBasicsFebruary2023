package A4ForLoop.Exercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfActor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= judges; i++) {
            String nameOfJudge = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            int nameLength = nameOfJudge.length();

            points =  points + (nameLength * judgePoints / 2) ;

            if (points > 1250.5) {
                break;
            }
        }
        if (points > 1250.5 ) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActor, points);
        } else {
            double diff = 1250.5 - points;
            System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, diff);
        }
    }
}
