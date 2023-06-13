package A6NestedLoops.Exercises;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int countAllGrades = 0;
        double sumAllGrades = 0;

        while (!command.equals("Finish")) {
            String name = command;


            double sumGrades = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());

                countAllGrades++;
                sumGrades += grade;
            }

            sumAllGrades += sumGrades;
            double avgGrades = sumGrades / n;

            System.out.printf("%s - %.2f.%n", name, avgGrades);

            command = scanner.nextLine();
        }
        double finalGrade = sumAllGrades / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);
    }
}
