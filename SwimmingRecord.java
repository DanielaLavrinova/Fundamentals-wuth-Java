import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = scanner.nextDouble();
        double distance = scanner.nextDouble();
        double time = scanner.nextDouble();
        double water = (Math.floor(distance / 15))* 12.5;
        double ivanRecord =(distance * time ) + water;

        if(ivanRecord < worldRecord){
            //double down = Math.floor(ivanRecord);
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds." , ivanRecord);
        }else if(ivanRecord > worldRecord){
            System.out.printf("No, he failed! He was %.2f seconds slower.", (ivanRecord - worldRecord));
        }
    }
}
