import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine()); //N
        int distance = Integer.parseInt(scanner.nextLine()); //M
        int exhaustion = Integer.parseInt(scanner.nextLine()); //Y
        int originalPower = power;
        int counter = 0;

        while(power >= distance){
            power -= distance;
            counter ++;

            if(power == originalPower * 0.5){
                if(exhaustion > 0){
                    power = power / exhaustion;
                }

            }

        }

        System.out.println(power);
        System.out.println(counter);
    }
}
