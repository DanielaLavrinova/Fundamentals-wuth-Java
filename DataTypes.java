package Methods;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeInput = scanner.nextLine();
        String data = scanner.nextLine();

        printDataType(typeInput,data);


    }

    public static void printDataType(String type,String data){
        switch (type){
            case "int":
                int number = Integer.parseInt(data);
                int sum = number * 2;
                System.out.println(sum);
                break;
            case "real":
                double numberInput = Double.parseDouble(data);
                double sumInput = numberInput * 1.5;
                System.out.printf("%.2f",sumInput);
                break;
            case "string":
                System.out.println("$" + data + "$");
                break;
        }

    }
}
