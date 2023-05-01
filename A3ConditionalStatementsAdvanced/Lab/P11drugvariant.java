package A3ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P11drugvariant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        
        double totalPrice = 0;

        if (fruit.equals("banana")) {
            switch (dayOfWeek) {
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
        } else if (fruit.equals("apple")) {
            switch (dayOfWeek) {
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
        } else if (fruit.equals("orange")) {
            switch (dayOfWeek) {
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
        } else if (fruit.equals("grapefruit")) {
            switch (dayOfWeek) {
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
        } else if (fruit.equals("kiwi")) {
            switch (dayOfWeek) {
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
        } else if (fruit.equals("pineapple")) {
            switch (dayOfWeek) {
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
        } else if (fruit.equals("grapes")) {
            switch (dayOfWeek) {
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
        } else {
            System.out.println("error");
        }
    }
}
