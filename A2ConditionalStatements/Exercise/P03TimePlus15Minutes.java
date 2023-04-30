package A2ConditionalStatements.Exercise;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMins = hour * 60 + minutes + 15;
        hour = totalMins / 60;
        minutes = totalMins % 60;

        if (hour > 23) {
            hour = 0;
        }
        // тък е важно да %02, иначе само с водеща нула не става на всички (примерно става ) 0:016ч.,а не 0:16ч.
        System.out.printf("%d:%02d", hour, minutes);
    }
}
