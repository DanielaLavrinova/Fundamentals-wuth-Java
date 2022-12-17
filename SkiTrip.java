import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        String room = scanner.next();
        room += scanner.nextLine();
        String rating = scanner.next();
        rating += scanner.nextLine();
        double price = 0.00;

        if(days >= 1 && days <= 365 &&(rating.equals("positive") || rating.equals("negative"))
                &&(room.equals("room for one person") || room.equals("apartment") || room.equals("president apartment"))) {

            if (room.equals("room for one person")) {
                price = (days - 1) * 18.00;
            } else if (room.equals("apartment")) {
                price = (days - 1) * 25.00;
                if (days < 10) {
                    price = price - price * 30 / 100;
                } else if (days >= 10 && days <= 15) {
                    price = price - price * 35 / 100;
                } else if (days > 15) {
                    price = price - price * 50 / 100;
                }
            } else if (room.equals("president apartment")) {
                price = (days - 1) * 35.00;
                if (days < 10) {
                    price = price - price * 10 / 100;
                } else if (days >= 10 && days <= 15) {
                    price = price - price * 15 / 100;
                } else if (days > 15) {
                    price = price - price * 20 / 100;
                }
            }

            if (rating.equals("positive")) {
                price = price + price * 25 / 100;
            } else if (rating.equals("negative")) {
                price = price - price * 10 / 100;
            }


            System.out.printf("%.2f", price);

        }
    }
}
