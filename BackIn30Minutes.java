import java.util.Scanner;

public class BackIn30Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int time = (hours * 60) + min + 30;
        int breakHours = time / 60;
        int breakMin = time % 60;

        if(breakHours > 23){
            breakHours = 0;
        }

        System.out.printf("%d:%02d",breakHours,breakMin);

    }
}
