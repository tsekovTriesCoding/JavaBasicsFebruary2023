package A4ForLoop.MoreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= period ; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (untreatedPatients > treatedPatients && i % 3 == 0 ) {
                doctors += 1;
            }
            if (patients <= doctors) {
                treatedPatients += patients;
            } else {
                untreatedPatients += patients - doctors;
                treatedPatients += doctors;

            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
