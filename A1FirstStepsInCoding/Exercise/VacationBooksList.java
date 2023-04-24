package A1FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PagesinBook = Integer.parseInt(scanner.nextLine());
        int PagesRead = Integer.parseInt(scanner.nextLine());
        int DaysNeeded = Integer.parseInt(scanner.nextLine());

        int TotalTimeForBook = PagesinBook / PagesRead;
        int HoursNeededPerDay =TotalTimeForBook / DaysNeeded;

        System.out.println(HoursNeededPerDay);
    }
}
