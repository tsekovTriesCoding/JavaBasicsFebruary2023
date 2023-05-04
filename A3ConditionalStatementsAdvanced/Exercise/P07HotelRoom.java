package A3ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberOfStayings = Integer.parseInt(scanner.nextLine());

        double priceForStudio = 0;
        double priceForApartment = 0;

        if (month.equals("May") || month.equals("October") ) {
            priceForStudio = 50 * numberOfStayings;
            priceForApartment = 65 * numberOfStayings;
            if (numberOfStayings > 7 && numberOfStayings <= 14) {
                priceForStudio = priceForStudio * 0.95;
            } else if (numberOfStayings > 14) {
                priceForStudio = priceForStudio * 0.70;
                priceForApartment = priceForApartment * 0.9;
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceForStudio = 75.20 * numberOfStayings;
            priceForApartment = 68.70 * numberOfStayings;
            if (numberOfStayings > 14) {
                priceForStudio = priceForStudio * 0.80;
                priceForApartment = priceForApartment * 0.9;
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceForStudio = 76 * numberOfStayings;
            priceForApartment = 77 * numberOfStayings;
            if (numberOfStayings > 14) {
                priceForApartment = priceForApartment * 0.9;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", priceForApartment);
        System.out.printf("Studio: %.2f lv.", priceForStudio);

    }
}
