import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nGroups = scanner.nextInt();
        int sumPeople = 0;
        double musala = 0;
        double montblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;


        for (int i = 1; i <= nGroups ; i++) {
            int numPeople = scanner.nextInt();
            sumPeople = sumPeople + numPeople;

            if(numPeople >= 1 && numPeople <= 5 ){
                musala = musala + numPeople;
            }else if(numPeople > 5 && numPeople <= 12){
                montblan = montblan + numPeople;
            }else if(numPeople > 12 && numPeople <= 25){
                kilimandjaro = kilimandjaro + numPeople;
            } else if (numPeople > 25 && numPeople <= 40) {
                k2 = k2 + numPeople;
            }else if(numPeople > 40 && numPeople <= 1000){
                everest = everest + numPeople;
            }
        }

        System.out.printf("%.2f%% %n", (musala / sumPeople * 100));
        System.out.printf("%.2f%% %n", (montblan / sumPeople * 100));
        System.out.printf("%.2f%% %n", (kilimandjaro / sumPeople * 100));
        System.out.printf("%.2f%% %n", (k2 / sumPeople * 100));
        System.out.printf("%.2f%% %n", (everest / sumPeople * 100));
    }
}
