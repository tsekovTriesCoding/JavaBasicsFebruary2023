package A7ExamPreparation.Exam6And7July2019;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentNotPainted = Integer.parseInt(scanner.nextLine());

        int area = height * width * 4;
        int wallsToBePainted = area - (area * percentNotPainted / 100);
        boolean ready = false;

        String command = scanner.nextLine();

        while (!command.equals("Tired!")) {
            int litresPaint = Integer.parseInt(command);

            wallsToBePainted -= litresPaint;

            if (wallsToBePainted <= 0) {
                ready = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (command.equals("Tired!")) {
            System.out.printf("%d quadratic m left.", wallsToBePainted);
        } else if (ready && wallsToBePainted < 0) {
            System.out.printf("All walls are painted and you have %d l paint left!", Math.abs(wallsToBePainted));
        } else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }

    }
}
