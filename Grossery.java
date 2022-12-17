import java.util.Scanner;

public class Grossery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.next();
        productName+= scanner.nextLine();
        String town = scanner.next();
        town += scanner.nextLine();
        double quantity = scanner.nextDouble();

        if(town.equals("Sofia")){
            if(productName.equals("coffee")){
                System.out.printf("%.2f",(quantity * 0.50));
            }else if(productName.equals("water")){
                System.out.printf("%.2f",(quantity * 0.80));
            }else if(productName.equals("beer")){
                System.out.printf("%.2f",(quantity * 1.20));
            }else if(productName.equals("sweets")){
                System.out.printf("%.2f",(quantity * 1.45));
            }else if(productName.equals("peanuts")){
                System.out.printf("%.2f",(quantity * 1.60));
            }
        } else if(town.equals("Plovdiv")){
            if(productName.equals("coffee")){
                System.out.printf("%.2f",(quantity * 0.40));
            }else if(productName.equals("water")){
                System.out.printf("%.2f",(quantity * 0.70));
            }else if(productName.equals("beer")){
                System.out.printf("%.2f",(quantity * 1.15));
            }else if(productName.equals("sweets")){
                System.out.printf("%.2f",(quantity * 1.30));
            }else if(productName.equals("peanuts")){
                System.out.printf("%.2f",(quantity * 1.50));
            }
        }else if(town.equals("Varna")){
            if(productName.equals("coffee")){
                System.out.printf("%.2f",(quantity * 0.45));
            }else if(productName.equals("water")){
                System.out.printf("%.2f",(quantity * 0.70));
            }else if(productName.equals("beer")){
                System.out.printf("%.2f",(quantity * 1.10));
            }else if(productName.equals("sweets")){
                System.out.printf("%.2f",(quantity * 1.35));
            }else if(productName.equals("peanuts")){
                System.out.printf("%.2f",(quantity * 1.55));
            }
        }
    }
}

