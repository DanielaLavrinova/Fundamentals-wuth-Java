package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] neighbourHood = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        int length = neighbourHood.length;

        int indexStart = 0;
        int lastIndex = 0;

        while(!input.equals("Love!")){
            int jump = Integer.parseInt(input.split(" ")[1]);
            indexStart += jump;
            if(indexStart >= 0 && indexStart < length){
                if(neighbourHood[indexStart] != 0){
                    neighbourHood[indexStart] -= 2;
                    if(neighbourHood[indexStart] <= 0){
                        System.out.printf("Place %d has Valentine's day.%n",indexStart);
                    }
                }else{
                    System.out.printf("Place %d already had Valentine's day.%n",indexStart);
                }


            }else if(indexStart >= length){
               indexStart = 0;
               if(neighbourHood[indexStart] != 0){
                   neighbourHood[indexStart] -= 2;
                   if(neighbourHood[indexStart] <= 0){
                       System.out.printf("Place %d has Valentine's day.%n",indexStart);
                   }
               }else{
                   System.out.printf("Place %d already had Valentine's day.%n",indexStart);
               }

            }

            lastIndex = indexStart;

            input = scanner.nextLine();

        }

        int houseCount = 0;

        for (int house:neighbourHood) {
            if(house != 0){
                houseCount ++;
            }
        }

        System.out.printf("Cupid's last position was %d.%n",lastIndex);

        if(houseCount != 0){
            System.out.printf("Cupid has failed %d places.",houseCount);
        }else{
            System.out.println("Mission was successful.");
        }



    }


}
