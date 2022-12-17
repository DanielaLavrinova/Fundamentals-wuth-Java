package ForLoop;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treatedP = 0;
        int untreatedP = 0;
        int totalUntreated = 0;
        int totalTreated = 0;

        for (int i = 1; i <= period ; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if ( i % 3 == 0 && totalTreated < totalUntreated){
                doctors ++;
            }

            if(patients > doctors){
                untreatedP = patients - doctors;
                totalUntreated += untreatedP;
                treatedP = patients - untreatedP;
            }else {
                treatedP = patients;
            }

            totalTreated += treatedP;

        }

        System.out.printf("Treated patients: %d.%nUntreated patients: %d.",totalTreated,totalUntreated);

    }
}
