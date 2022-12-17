package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String command = input.split(" ")[0];
            int index = Integer.parseInt(input.split(" ")[1]);
            boolean validIndex = isIndexValid(index,targetList);
            int targetToShoot = 0;

            switch (command){
                case "Shoot":
                    int power = Integer.parseInt(input.split(" ")[2]);

                    if(validIndex){
                        targetToShoot = targetList.get(index);
                        if(targetToShoot > 0){
                            targetToShoot -= power;
                            if(targetToShoot > 0){
                                targetList.set(index,targetToShoot);
                            }else{
                                targetList.remove(index);
                            }

                        }else{
                            targetList.remove(index);

                        }

                    }

                    break;
                case "Add":
                    int value = Integer.parseInt(input.split(" ")[2]);

                    if(validIndex){
                        targetList.add(index,value);

                    }else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(input.split(" ")[2]);
                    int startIndex = index - radius;
                    int endIndex = index + radius;
                    boolean validStart = isIndexValid(startIndex,targetList);
                    boolean validEnd = isIndexValid(endIndex,targetList);

                    if(validIndex && validStart && validEnd){
                        for (int i = startIndex; i <= endIndex ; i++) {
                            targetList.remove(startIndex);
                        }

                    }else{
                        System.out.println("Strike missed!");
                    }
                    break;
            }



            input = scanner.nextLine();

        }

        for (int i = 0; i < targetList.size() - 1;i ++) {
            System.out.print(targetList.get(i) + "|");
        }
        System.out.print(targetList.get(targetList.size()- 1));
    }

    public static boolean isIndexValid(int index,List<Integer> numbersList){
        return index >= 0 && index <= numbersList.size() -1;
    }
}
