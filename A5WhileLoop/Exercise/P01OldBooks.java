package A5WhileLoop.Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String input = scanner.nextLine();
        int bookCount = 0;
        boolean bookFound = false;

        while (!input.equals("No More Books")) {

            if (input.equals(book)) {
                bookFound = true;
                break;
            }

            bookCount++;
            input = scanner.nextLine();

        }
        if (bookFound) {
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}
