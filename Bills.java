package ForLoop;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double averageBill = 0;
        int waterBill = 20;
        int netBill = 15;
        double anotherBill = 0;
        double totalElectricity = 0;
        double totalWater = 0;
        double totalNet = 0;
        double totalAnother = 0;



        for (int i = 1; i <= months ; i++) {
            double billElectricity = Double.parseDouble(scanner.nextLine());
            totalElectricity += billElectricity;
            totalWater += 20;
            totalNet += 15;

            anotherBill = billElectricity + waterBill + netBill + ((billElectricity + waterBill + netBill) * 0.20);

            totalAnother += anotherBill;

        }

        averageBill = (totalElectricity + totalWater + totalNet + totalAnother) / months;
        System.out.printf("Electricity: %.2f lv%n",totalElectricity);
        System.out.printf("Water: %.2f lv%n",totalWater);
        System.out.printf("Internet: %.2f lv%n",totalNet);
        System.out.printf("Other: %.2f lv%n",totalAnother);
        System.out.printf("Average: %.2f lv",averageBill);

    }
}
