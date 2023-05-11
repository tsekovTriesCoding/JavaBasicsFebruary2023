package A4ForLoop.MoreExercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;
        int totalFans = 0;
        double percentFull = 0;

        for (int i = 1; i <= fans ; i++) {
            String sector = scanner.nextLine();

            if (sector.equals("A")) {
                sectorA ++;
            } else if (sector.equals("B")) {
                sectorB ++;
            } else if (sector.equals("V")) {
                sectorV ++;
            } else if (sector.equals("G")) {
                sectorG ++;
            }
            totalFans = sectorA + sectorB + sectorV + sectorG;
            percentFull = totalFans * 1.0 / stadiumCapacity * 100;
        }
        System.out.printf("%.2f%%%n",sectorA * 1.0 / totalFans * 100);
        System.out.printf("%.2f%%%n",sectorB * 1.0 / totalFans * 100);
        System.out.printf("%.2f%%%n",sectorV * 1.0 / totalFans * 100);
        System.out.printf("%.2f%%%n",sectorG * 1.0 / totalFans * 100);
        System.out.printf("%.2f%%",percentFull);
    }
}
