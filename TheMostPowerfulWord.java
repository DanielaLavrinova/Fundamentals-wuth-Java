package PBExams;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int maxSum = Integer.MIN_VALUE;
        String maxWord = "";

        while(!word.equals("End of words")){
            int length = word.length();
            int sum = 0;
            char firstLetter = word.charAt(0);

            for (int i = 0; i < length ; i++) {
                char symbol = word.charAt(i);
                int number = symbol;
                sum += number;

            }

           switch (firstLetter){

               case 'a':
               case 'e':
               case 'i':
               case 'u':
               case 'y':
               case 'A':
               case 'O':
               case 'U':
               case 'I':
               case 'Y':
               case 'E':
               case 'o':
                   sum = sum * length;
                   break;
               default:
                   sum = sum / length;

           }

            if(sum > maxSum){
                maxSum = sum;
                maxWord = word;

            }

            word = scanner.nextLine();

        }

        System.out.printf("The most powerful word is %s - %d",maxWord,maxSum);

    }

}
