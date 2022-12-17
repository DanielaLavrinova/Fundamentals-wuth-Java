package ConditionalStatements;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int totalExam = hourExam * 60 + minExam;
        int totalArrival = arrivalHour * 60 + arrivalMin;

        int diff = Math.abs(totalExam - totalArrival);
        int hour = diff / 60;
        int min = diff % 60;

        if((totalExam >= totalArrival)){
            if(totalExam == totalArrival){
                System.out.println("On time");
            } else if(totalExam - totalArrival <=30){
                System.out.println("On time");
                if(hour == 0){
                    System.out.printf("%d minutes before the start",min);
                }else{
                    System.out.printf("%d:%02d hours before the start",hour,min);
                }
            }else {
                System.out.println("Early");
                if(hour == 0){
                    System.out.printf("%d minutes before the start",min);
                }else{
                    System.out.printf("%d:%02d hours before the start",hour,min);
                }
            }
        } else {
            System.out.println("Late");
            if(hour == 0){
                System.out.printf("%d minutes after the start",min);
            }else{
                System.out.printf("%d:%02d hours after the start",hour,min);
            }
        }
    }
}
