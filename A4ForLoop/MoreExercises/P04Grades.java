package A4ForLoop.MoreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOFStudents = Integer.parseInt(scanner.nextLine());

        int excellent = 0;
        int medium = 0;
        int low = 0;
        int poor = 0;
        int totalStudents = 0;
        double totalGrade = 0;

        for (int i = 1; i <= numberOFStudents ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            
            if (grade >= 5.00) {
                excellent ++ ;
            } else if (grade >= 4.00) {
                medium ++;
            } else if (grade >= 3.00) {
                low ++;
            } else {
                poor ++;
            }
            totalGrade += grade;
            totalStudents = excellent + medium + low + poor;
        }
        System.out.printf("Top students: %.2f%%%n", excellent * 1.0 / totalStudents * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", medium * 1.0 / totalStudents * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", low * 1.0 / totalStudents * 100);
        System.out.printf("Fail: %.2f%%%n", poor * 1.0 / totalStudents * 100);
        System.out.printf("Average: %.2f",totalGrade / totalStudents);

    }
}
