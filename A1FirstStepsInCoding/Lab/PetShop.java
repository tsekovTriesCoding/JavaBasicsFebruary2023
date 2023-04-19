package A1FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogsfood = Integer.parseInt(scanner.nextLine());
        int catsfood = Integer.parseInt(scanner.nextLine());

        double dogsfoodprice = dogsfood * 2.5;
        double catsfoodprice = catsfood * 4.0;
        // moje i s napravo rezultata - double result = (dogsfood*2.5) + (catsfood*4);
        double totalcost = dogsfoodprice + catsfoodprice;

        System.out.printf("%.1f lv.", totalcost);
    }
}
