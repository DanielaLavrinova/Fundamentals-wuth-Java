import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        String days = scanner.next();
        days += scanner.nextLine();

        if(days.equals("Monday") || days.equals("Tuesday") || days.equals("Wednesday") || days.equals("Thursday") || days.equals("Friday") || days.equals("Saturday")){
            if(hours>= 10 && hours <= 18){
                System.out.println("open");
            }else{
                System.out.println("closed");
            }
        }else{
            System.out.println("closed");
        }
    }
}
