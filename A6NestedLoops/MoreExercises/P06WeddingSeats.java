package A6NestedLoops.MoreExercises;

import java.util.Scanner;

public class P06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sector = scanner.nextLine();
        int rowsInFirstSector = Integer.parseInt(scanner.nextLine());
        int seatsInOddRow = Integer.parseInt(scanner.nextLine());

        int seatsInEvenRow = seatsInOddRow + 2;

        int seatCounter = 0;

        for (char i = 'A'; i <= sector.charAt(0); i++) {
            if (i != 'A') {
                rowsInFirstSector += 1;
            }
            for (int j = 1; j <= rowsInFirstSector; j++) {
                if (j % 2 == 0) {
                    seatsInOddRow = seatsInEvenRow;
                }
                for (int k = 1; k <= seatsInOddRow; k++) {
                    seatCounter++;
                    System.out.printf("%c%d%c%n", i, j, k + 96);
                }
                if (j % 2 == 0) {
                    seatsInOddRow -= 2;
                }
            }
        }
        System.out.println(seatCounter);
    }

}

