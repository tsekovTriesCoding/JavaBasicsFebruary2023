package A7ExamPreparation.Exam15And16June2019;

import java.util.Scanner;

public class P03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String pack = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (movie.equals("John Wick")) {
            switch (pack) {
                case "Drink":
                    price = tickets * 12;
                    break;
                case "Popcorn":
                    price = tickets * 15;
                    break;
                case "Menu":
                    price = tickets * 19;
                    break;
            }

        } else if (movie.equals("Star Wars")) {
            switch (pack) {
                case "Drink":
                    price = tickets * 18;
                    break;
                case "Popcorn":
                    price = tickets * 25;
                    break;
                case "Menu":
                    price = tickets * 30;
                    break;
            }

        } else if (movie.equals("Jumanji")) {
            switch (pack) {
                case "Drink":
                    price = tickets * 9;
                    break;
                case "Popcorn":
                    price = tickets * 11;
                    break;
                case "Menu":
                    price = tickets * 14;
                    break;
            }
        }
        if (movie.equals("Star Wars") && tickets >= 4) {
            price = price * 0.7;
        } else if (movie.equals("Jumanji") && tickets == 2) {
            price = price * 0.85;
        }

        System.out.printf("Your bill is %.2f leva.", price);
    }
}
