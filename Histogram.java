import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double counter1 = 0;
        double counter2 = 0;
        double counter3 = 0;
        double counter4 = 0;
        double counter5 = 0;

        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;

        for (int i = 1; i <= n ; i++) {
            int number = scanner.nextInt();

            if(number >= 1 && number < 200){
                counter1 += 1;
                p1 = counter1 / n * 100;
            }else if(number >= 200 && number < 400){
                counter2 += 1;
                p2 = counter2 / n * 100;
            }else if (number >= 400 && number < 600){
                counter3 += 1;
                p3 = counter3 / n * 100;
            }else if (number >= 600 && number < 800){
                counter4 += 1;
                p4 = counter4 / n * 100;
            }else if(number >= 800 && number <= 1000){
                counter5 += 1;
                p5 = counter5 / n  * 100;
            }
        }

        System.out.printf("%.2f%% %n",p1);
        System.out.printf("%.2f%% %n",p2);
        System.out.printf("%.2f%% %n",p3);
        System.out.printf("%.2f%% %n",p4);
        System.out.printf("%.2f%% %n",p5);

    }
}
