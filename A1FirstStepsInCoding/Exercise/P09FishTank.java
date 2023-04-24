package A1FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Lenght = Integer.parseInt(scanner.nextLine());
        int Widht = Integer.parseInt(scanner.nextLine());
        int Height = Integer.parseInt(scanner.nextLine());
        double Percent = Double.parseDouble(scanner.nextLine());

        double Volume = Lenght * Widht * Height;
        double VolumeInLiters = Volume * 0.001;

        double LitersNeeded = VolumeInLiters * (1 - (Percent / 100));

        System.out.println(LitersNeeded);
    }
}
