package A7ExamPreparation.Exam18And19July2020;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        for (int i = num1.charAt(0); i <= num2.charAt(0); i++) {
            for (int j = num1.charAt(1); j <= num2.charAt(1); j++) {
                for (int k = num1.charAt(2); k <= num2.charAt(2); k++) {
                    for (int l = num1.charAt(3); l <= num2.charAt(3); l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%c%c%c%c ", i, j, k, l);
                        }
                    }
                }
            }

        }
    }
}
