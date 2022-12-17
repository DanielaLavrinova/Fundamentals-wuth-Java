import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        month += scanner.nextLine();
        int nights = scanner.nextInt();
        double priceStudio = 0.00;
        double priceApartment = 0.00;

        if(nights >= 0 && nights <= 200 &&(month.equals("May") || month.equals("June") || month.equals("July")
        || month.equals("August") || month.equals("September") || month.equals("October")) ){

            if(month.equals("May") || month.equals("October")){
                priceStudio = nights * 50;
                priceApartment = nights * 65;
                if(nights > 7 && nights <= 14){
                    priceStudio = priceStudio - priceStudio * 5/100;
                }else if(nights > 14){
                    priceStudio = priceStudio - priceStudio * 30/100;
                    priceApartment = priceApartment - priceApartment * 10/100;
                }
            }else if(month.equals("June") || month.equals("September")){
                priceStudio = nights * 75.20;
                priceApartment = nights * 68.70;
                if(nights > 14){
                    priceStudio = priceStudio - priceStudio * 20/100;
                    priceApartment = priceApartment - priceApartment * 10/100;
                }

            }else if(month.equals("July") || month.equals("August")){
                priceStudio = nights * 76;
                priceApartment = nights * 77;
                if(nights > 14){
                    priceApartment = priceApartment - priceApartment * 10/100;
                }
            }

            System.out.printf("Apartment: %.2f lv.",priceApartment);
            System.out.println();
            System.out.printf("Studio: %.2f lv.",priceStudio);
        }
    }
}
