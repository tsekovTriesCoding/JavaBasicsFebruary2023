package A7ExamPreparation.Exam6And7July2019;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantedProfit = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double profit = 0;
        double totalProfit = 0;

        boolean enoughProfit = false;

        while (!command.equals("Party!")) {
            String cocktailName = command;
            int numOfCocktails = Integer.parseInt(scanner.nextLine());

            double cocktailPrice = cocktailName.length();
            profit = numOfCocktails * cocktailPrice;


            if (profit % 2 != 0) {
                profit = profit * 0.75;
            }
            totalProfit += profit;

            if (totalProfit >= wantedProfit) {
                enoughProfit = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (enoughProfit) {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", totalProfit);
        } else {
            double diff = wantedProfit - totalProfit;
            System.out.printf("We need %.2f leva more.%n", diff);
            System.out.printf("Club income - %.2f leva.", totalProfit);
        }
    }
}
