package PBExams;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String packageType = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;
        boolean flag = false;

        if(days > 7){

            days = days - 1;

        }

        if(days < 1){
            System.out.println("Days must be positive number!");
            flag = true;
        }

        switch (city){

            case "Bansko":
                case "Borovets":

                switch (packageType){

                    case "noEquipment":
                        price = days * 80;
                        if(vip.equals("yes")){

                            price = price - price * 0.05;

                        }
                        break;
                    case "withEquipment":
                        price = days * 100;
                        if(vip.equals("yes")){

                            price = price - price * 0.10;

                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        flag = true;

                }
                break;
            case "Varna":
            case "Burgas":

                switch (packageType){

                    case "withBreakfast":
                        price = days * 130;
                        if(vip.equals("yes")){

                            price = price - price * 0.12;

                        }
                        break;
                    case "noBreakfast":
                        price = days * 100;
                        if(vip.equals("yes")){

                            price = price - price * 0.07;

                        }
                        break;
                        default:
                        System.out.println("Invalid input!");
                        flag = true;
                }
                break;
            default:
                System.out.println("Invalid input!");
                flag = true;
        }

        if(!flag){

            System.out.printf("The price is %.2flv! Have a nice time!",price);

        }

    }
}
