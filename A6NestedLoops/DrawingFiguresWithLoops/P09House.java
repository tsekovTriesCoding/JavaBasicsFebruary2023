package A6NestedLoops.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P09House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int stars = 1;
        if (n % 2 == 0) {
            stars++;
        }

        double roofLength = (int) Math.ceil(n / 2f);

        for (int i = 0; i < roofLength; i++) {
            int dashes = (n - stars) / 2;
            String dash = "-";
            String star = "*";
            System.out.print(dash.repeat(dashes));
            System.out.print(star.repeat(stars));
            System.out.print(dash.repeat(dashes));

            System.out.println();
            stars += 2;
        }

        for (int j = 1; j <= n / 2; j++) {
            String line = "|";
            String star = "*";

            System.out.print(line);
            System.out.print(star.repeat(n - 2));
            System.out.print(line);
            System.out.println();
        }
    }
}
