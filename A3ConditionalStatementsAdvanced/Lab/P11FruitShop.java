package A3ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfweek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;

        switch (fruit) {
            case "banana":
                switch (dayOfweek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 2.50;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 2.70;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "apple":
                switch (dayOfweek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 1.20;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 1.25;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "orange":
                switch (dayOfweek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 0.85;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 0.90;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "grapefruit":
                switch (dayOfweek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 1.45;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 1.60;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "kiwi":
                switch (dayOfweek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 2.70;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 3.00;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "pineapple":
                switch (dayOfweek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 5.50;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 5.60;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "grapes":
                switch (dayOfweek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 3.85;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 4.20;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
        }
    }
}
