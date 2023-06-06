package A5WhileLoop.MoreExercises;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String word = "";
        int cCounter = 0;
        int oCounter = 0;
        int nCounter = 0;

        while (!input.equals("End")) {
            char letter = input.charAt(0);

            if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {
                switch (letter) {
                    case 'c':
                        cCounter++;
                        if (cCounter >= 2) {
                            word += letter;
                        }
                        break;
                    case 'o':
                        oCounter++;
                        if (oCounter >= 2) {
                            word += letter;
                        }
                        break;
                    case 'n':
                        nCounter++;
                        if (nCounter >= 2) {
                            word += letter;
                        }
                        break;
                    default:
                        word += letter;
                        break;
                }
            }

            if (cCounter >= 1 && oCounter >= 1 && nCounter >= 1) {
                System.out.print(word + ' ');
                cCounter = 0;
                oCounter = 0;
                nCounter = 0;
                word = "";
            }

            input = scanner.nextLine();
        }
    }
}
