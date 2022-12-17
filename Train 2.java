package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while(!input.equals("end")){
            if(input.contains("Add")){
                int pax = Integer.parseInt(input.split(" ")[1]);
                listWagons.add(pax);
            }else {
                int paxToAdd = Integer.parseInt(input);
                for (int i = 0; i < listWagons.size(); i++) {
                    int currentPax = listWagons.get(i);
                    if(currentPax + paxToAdd <= maxCapacity){
                        listWagons.set(i,currentPax + paxToAdd);
                        break;
                    }
                }
            }

            input = scanner.nextLine();

        }

        System.out.println(listWagons.toString().replaceAll("[\\[\\],]",""));
    }
}
