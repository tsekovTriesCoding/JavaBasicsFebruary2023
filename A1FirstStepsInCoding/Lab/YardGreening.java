package A1FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Sqrmeters = Double.parseDouble(scanner.nextLine());

        double totalprice = Sqrmeters * 7.61;
        double discount = totalprice * 0.18;
        double pricewithoutdiscount = totalprice - discount;

        System.out.printf("The final price is: %.2f lv.", pricewithoutdiscount);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
