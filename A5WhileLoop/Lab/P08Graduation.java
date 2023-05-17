package A5WhileLoop.Lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double totalGrades = 0;
        int goodGradesCount = 0;
        int badGradesCount = 0;
        int gradeCount = 1;

        boolean excluded = false;

        while (goodGradesCount < 12) {

            if (badGradesCount == 2) {
                excluded = true;
                break;
            }

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                badGradesCount++;
                continue;
            }

            goodGradesCount++;
            totalGrades += grade;
            gradeCount++;

        }
        if (excluded) {
            System.out.printf("%s has been excluded at %d grade", name, gradeCount);
        } else {
            double avgGrade = totalGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f ", name, avgGrade);
        }
    }
}
