package WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        boolean isValid = false;
        double averageScore = 0;
        int counter = 0;
        int numClass = 0;

        while(numClass < 12){
            double score = Double.parseDouble(scanner.nextLine());
            if(score < 4){
                counter ++;
                if(counter > 1){
                    isValid = true;
                    break;
                }
            }
            averageScore += score;

            numClass ++;
        }

        if(isValid){
            System.out.printf("%s has been excluded at %d grade",name,numClass);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f",name,(averageScore / numClass));
        }

    }
}
