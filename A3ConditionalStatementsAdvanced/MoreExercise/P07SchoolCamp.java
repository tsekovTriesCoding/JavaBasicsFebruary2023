package A3ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentCount = Integer.parseInt(scanner.nextLine());
        int sleepsCount = Integer.parseInt(scanner.nextLine());

        double cost = 0;
        String sportType = "";

        switch (season) {
            case "Winter":
                if (groupType.equals("boys") || groupType.equals("girls")) {
                    cost = 9.60 * studentCount * sleepsCount;
                } else if (groupType.equals("mixed")) {
                    cost = 10 * studentCount * sleepsCount;
                }
                if (studentCount >= 50) {
                    cost = cost * 0.5;
                } else if (studentCount >= 20 && studentCount < 50) {
                    cost = cost * 0.85;
                } else if (studentCount >= 10 && studentCount < 20){
                    cost = cost * 0.95;
                }

                if (groupType.equals("girls")) {
                    sportType = "Gymnastics";
                } else if (groupType.equals("boys")) {
                    sportType = "Judo";
                } else if (groupType.equals("mixed")) {
                    sportType = "Ski";
                }
                System.out.printf("%s %.2f lv.", sportType, cost);
                break;
            case "Spring":
                if (groupType.equals("boys") || groupType.equals("girls")) {
                    cost = 7.20 * studentCount * sleepsCount;
                } else if (groupType.equals("mixed")) {
                    cost = 9.50 * studentCount * sleepsCount;
                }
                if (studentCount >= 50) {
                    cost = cost * 0.5;
                } else if (studentCount >= 20 && studentCount < 50) {
                    cost = cost * 0.85;
                } else if (studentCount >= 10 && studentCount < 20){
                    cost = cost * 0.95;
                }
                if (groupType.equals("girls")) {
                    sportType = "Athletics";
                } else if (groupType.equals("boys")) {
                    sportType = "Tennis";
                } else if (groupType.equals("mixed")) {
                    sportType = "Cycling";
                }
                System.out.printf("%s %.2f lv.", sportType, cost);
                break;
            case "Summer":
                if (groupType.equals("boys") || groupType.equals("girls")) {
                    cost = 15 * studentCount * sleepsCount;
                } else if (groupType.equals("mixed")) {
                    cost = 20 * studentCount * sleepsCount;
                }
                if (studentCount >= 50) {
                    cost = cost * 0.5;
                } else if (studentCount >= 20 && studentCount < 50) {
                    cost = cost * 0.85;
                } else if (studentCount >= 10 && studentCount < 20){
                    cost = cost * 0.95;
                }
                if (groupType.equals("girls")) {
                    sportType = "Volleyball";
                } else if (groupType.equals("boys")) {
                    sportType = "Football";
                } else if (groupType.equals("mixed")) {
                    sportType = "Swimming";
                }
                System.out.printf("%s %.2f lv.", sportType, cost);
                break;
        }
    }
}
