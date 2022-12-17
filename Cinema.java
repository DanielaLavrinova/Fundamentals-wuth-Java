import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.next();
        projection += scanner.nextLine();
        double rows = scanner.nextDouble();
        double columns = scanner.nextDouble();
        double income = 0.0;

        if(projection.equals("Premiere")){
            income = rows * columns * 12.00;
        }else if(projection.equals("Normal")){
            income = rows * columns * 7.50;
        }else if(projection.equals("Discount")){
            income = rows * columns * 5.00;
        }
        System.out.printf("%.2f leva" , income);
    }
}
