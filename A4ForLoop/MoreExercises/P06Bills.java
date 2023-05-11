package A4ForLoop.MoreExercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double totalelectricity = 0;
        double water = 0;
        double internet = 0;
        double others = 0;
        double totalCost = 0;

        for (int i = 1; i <= months ; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());

            totalelectricity = totalelectricity + electricity;
            water += 20;
            internet += 15;
            others = (totalelectricity + water + internet);
            others = others + others * 0.2;

            totalCost = totalelectricity + water + internet + others;
        }
        System.out.printf("Electricity: %.2f lv%n",totalelectricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", others);
        System.out.printf("Average: %.2f lv", totalCost / months);
    }
}
