package PBExams;

import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int counter = 0;
        boolean flag = false;
        int maxSum = Integer.MIN_VALUE;
        String favorite = "";

        while(!name.equals("STOP")){
            counter ++;
            int number = name.length();
            int sum = 0;
            int totalSum = 0;

            for (int i = 0; i < number ; i++) {

                char symbol = name.charAt(i);

                switch(symbol){

                    case 'A':
                        sum = 65 - number;
                        break;
                    case 'B':
                        sum = 66 - number;
                        break;
                    case 'C':
                        sum = 67 - number;
                        break;
                    case 'D':
                        sum = 68 - number;
                        break;
                    case 'E':
                        sum = 69 - number;
                        break;
                    case 'F':
                        sum = 70 - number;
                        break;
                    case 'G':
                        sum = 71 - number;
                        break;
                    case 'H':
                        sum = 72 - number;
                        break;
                    case 'I':
                        sum = 73 - number;
                        break;
                    case 'J':
                        sum = 74 - number;
                        break;
                    case 'K':
                        sum = 75 - number;
                        break;
                    case 'L':
                        sum = 76 - number;
                        break;
                    case 'M':
                        sum = 77 - number;
                        break;
                    case 'N':
                        sum = 78 - number;
                        break;
                    case 'O':
                        sum = 79 - number;
                        break;
                    case 'P':
                        sum = 80 - number;
                        break;
                    case 'Q':
                        sum = 81 - number;
                        break;
                    case 'R':
                        sum = 82 - number;
                        break;
                    case 'S':
                        sum = 83 - number;
                        break;
                    case 'T':
                        sum = 84 - number;
                        break;
                    case 'U':
                        sum = 85 - number;
                        break;
                    case 'V':
                        sum = 86 - number;
                        break;
                    case 'W':
                        sum = 87 - number;
                        break;
                    case 'X':
                        sum = 88 - number;
                        break;
                    case 'Y':
                        sum = 89 - number;
                        break;
                    case 'Z':
                        sum = 90 - number;
                        break;
                    case 'a':
                        sum = 97 - 2 * number;
                        break;
                    case 'b':
                        sum = 98 - 2 * number;
                        break;
                    case 'c':
                        sum = 99 - 2 * number;
                        break;
                    case 'd':
                        sum = 100 - 2 * number;
                        break;
                    case 'e':
                        sum = 101 - 2 * number;
                        break;
                    case 'f':
                        sum = 102 - 2 * number;
                        break;
                    case 'g':
                        sum = 103 - 2 * number;
                        break;
                    case 'h':
                        sum = 104 - 2 * number;
                        break;
                    case 'i':
                        sum = 105 - 2 * number;
                        break;
                    case 'j':
                        sum = 106 - 2 * number;
                        break;
                    case 'k':
                        sum = 107 - 2 * number;
                        break;
                    case 'l':
                        sum = 108 - 2 * number;
                        break;
                    case 'm':
                        sum = 109 - 2 * number;
                        break;
                    case 'n':
                        sum = 110 - 2 * number;
                        break;
                    case 'o':
                        sum = 111 - 2 * number;
                        break;
                    case 'p':
                        sum = 112 - 2 * number;
                        break;
                    case 'q':
                        sum = 113 - 2 * number;
                        break;
                    case 'r':
                        sum = 114 - 2 * number;
                        break;
                    case 's':
                        sum = 115 - 2 * number;
                        break;
                    case 't':
                        sum = 116 - 2 * number;
                        break;
                    case 'u':
                        sum = 117 - 2 * number;
                        break;
                    case 'v':
                        sum = 118 - 2 * number;
                        break;
                    case 'w':
                        sum = 119 - 2 * number;
                        break;
                    case 'x':
                        sum = 120 - 2 * number;
                        break;
                    case 'y':
                        sum = 121 - 2 * number;
                        break;
                    case 'z':
                        sum = 122 - 2 * number;
                        break;
                    case ' ':
                        sum = 32;
                        break;
                    case '2':
                        sum = 50;
                        break;

                }

                totalSum = totalSum + sum;

                if(totalSum > maxSum){

                    maxSum = totalSum;
                    favorite = name;

                }

                sum = 0;



            }


            if(counter >= 7){
                flag = true;
                break;
            }



            name = scanner.nextLine();

        }

        if(flag){
            System.out.println("The limit is reached.");
            System.out.printf("The best movie for you is %s with %d ASCII sum.",favorite,maxSum);

        }else {
            System.out.printf("The best movie for you is %s with %d ASCII sum.",favorite,maxSum);

        }

    }
}
