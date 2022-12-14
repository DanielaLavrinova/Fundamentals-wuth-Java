package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productsList = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String product = scanner.nextLine();
            productsList.add(i,product);
        }

        Collections.sort(productsList);

        for (int i = 0; i < productsList.size(); i++) {
            String product = productsList.get(i);
            System.out.printf("%d.%s%n",i + 1,product);

        }
    }
}

