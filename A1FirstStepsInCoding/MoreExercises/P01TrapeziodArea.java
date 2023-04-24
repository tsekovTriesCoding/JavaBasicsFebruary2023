package A1FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P01TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b1 = Integer.parseInt(scanner.nextLine());
        int b2 = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double area = (b1 + b2) * h / 2.0;
        System.out.printf("%.2f", area);
    }
}
