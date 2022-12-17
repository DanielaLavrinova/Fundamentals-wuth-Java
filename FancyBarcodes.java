package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("^@#+([A-Z][A-Za-z0-9]{4,}[A-Z])@#+$");

        for (int i = 1; i <= n ; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);

            if(matcher.find()){
                String product = matcher.group();
                StringBuilder productNumber = new StringBuilder();
                for (int j = 0; j < product.length(); j++) {
                    char symbol = product.charAt(j);
                    if(Character.isDigit(symbol)){
                        productNumber.append(symbol);
                    }
                }
                if(productNumber.length() == 0){
                    productNumber = new StringBuilder("00");
                }
                System.out.printf("Product group: %s%n",productNumber);
            }else{
                System.out.println("Invalid barcode");
            }

        }
    }
}
