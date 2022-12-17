package ForLoop;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int numFans = Integer.parseInt(scanner.nextLine());

        int fanA = 0;
        int fanB = 0;
        int fanV = 0;
        int fanG = 0;
        double totalFans = 0;


        for (int i = 1; i <= numFans ; i++) {
            String sector = scanner.nextLine();

            switch (sector){
                case "A":
                    fanA ++;
                    break;
                case "B":
                    fanB ++;
                    break;
                case "V":
                    fanV ++;
                    break;
                case "G":
                    fanG ++;
                    break;
            }

        }

        totalFans = (numFans * 1.00 / capacity) * 100;

        System.out.printf("%.2f%%%n", (fanA * 1.00 /numFans) * 100);
        System.out.printf("%.2f%%%n", (fanB * 1.00 /numFans) * 100);
        System.out.printf("%.2f%%%n", (fanV * 1.00 /numFans) * 100);
        System.out.printf("%.2f%%%n", (fanG * 1.00 /numFans) * 100);
        System.out.printf("%.2f%%%n", totalFans);

    }
}
