import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int  minutes = scanner.nextInt();
        int hoursToMinutes = hours * 60;
        int  plus15 = hoursToMinutes + minutes + 15;
        int hours1 = plus15 / 60;
        int minutes1 = plus15 % 60;

        if(hours1 > 23){
            hours1 = hours1 -24 ;
        }

        if(minutes1 < 10) {
            System.out.printf("%d:0%d", hours1, minutes1);
        }else {
            System.out.printf("%d:%d", hours1, minutes1);
        }
    }
}
