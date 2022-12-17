import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());
        int totalSpices = 0;
        int days = 0;

        while(source >= 100){
            int spices = source - 26;
            totalSpices += spices;
            days ++;
            source = source - 10;

        }

        if(totalSpices >= 26){
            totalSpices -= 26;
        }
        System.out.println(days);
        System.out.println(totalSpices);



    }
}
