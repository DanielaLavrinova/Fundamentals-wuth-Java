package MidExam;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int plunderPerDay = Integer.parseInt(scanner.nextLine());
        int expectedPlunder = Integer.parseInt(scanner.nextLine());

        double totalPlunder = 0;

        for (int i = 1; i <= days; i++) {
            totalPlunder += plunderPerDay;
            if(i % 3 == 0){
                totalPlunder += (plunderPerDay * 0.50);

            }
            if(i % 5 == 0){
                totalPlunder = totalPlunder - totalPlunder * 0.30;
            }

        }

        if(totalPlunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",totalPlunder);
        }else{
            System.out.printf("Collected only %.2f%% of the plunder.",(totalPlunder / expectedPlunder)* 100);
        }


    }
}
