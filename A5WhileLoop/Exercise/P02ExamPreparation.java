package A5WhileLoop.Exercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int badGradesCount = 0;
        boolean needBreak = false;
        int totalGrades = 0;
        int gradeCount = 0;
        int taskCount = 0;
        String lastProblem = "";

        while (!input.equals("Enough")) {
            String currentProblem = input;
            int grade = Integer.parseInt(scanner.nextLine());
            lastProblem = currentProblem;
            taskCount++;

            if (grade <= 4) {
                badGradesCount++;
            }

            totalGrades += grade;

            if (badGrades <= badGradesCount) {
                needBreak = true;
                break;
            }

            gradeCount++;
            input = scanner.nextLine();
        }

        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.", badGradesCount);
        } else {
            System.out.printf("Average score: %.2f%n", totalGrades * 1.0 / gradeCount);
            System.out.printf("Number of problems: %d%n", taskCount);
            System.out.printf("Last problem: %s", lastProblem);

        }
    }
}
