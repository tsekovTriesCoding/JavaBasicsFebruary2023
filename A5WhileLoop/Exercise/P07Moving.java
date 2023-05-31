package A5WhileLoop.Exercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace = width * length * height;

        String command = scanner.nextLine();
        int totalBoxes = 0;
        boolean noMoreSpace = false;

        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);
            freeSpace -= boxes;

            if (freeSpace <= 0) {
                noMoreSpace = true;
                break;
            }
            command = scanner.nextLine();
        }
        int diff = Math.abs(totalBoxes - freeSpace);
        if (noMoreSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else {
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}
