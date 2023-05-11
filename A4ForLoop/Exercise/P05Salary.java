package A4ForLoop.Exercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= openTabs; i++) {
            String socialMedia = scanner.nextLine();

            if (socialMedia.equals("Facebook")) {
                salary -= 150;
            } else if (socialMedia.equals("Instagram")) {
                salary -= 100;
            } else if (socialMedia.equals("Reddit")) {
                salary -= 50;
            }

            if (salary <= 0) {
                break;
            }
        }

        if (salary > 0){
            System.out.printf("%d",salary);
        } else {
            System.out.println("You have lost your salary.");
        }
    }
}
