import java.util.Scanner;

public class ExamTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = scanner.nextInt();
        int minutesExam = scanner.nextInt();
        int arrivalHour = scanner.nextInt();
        int arrivalMinutes = scanner.nextInt();

        int totalExam = (hourExam * 60) + minutesExam;
        int totalArrival = (arrivalHour * 60) + arrivalMinutes;

        if((hourExam >= 0 && hourExam <= 23 && minutesExam >= 0 && minutesExam <= 59)
                && (arrivalHour >= 0 && arrivalHour <= 23 && arrivalMinutes >= 0 && arrivalMinutes <= 59)){

            if(totalArrival > totalExam){
                System.out.println("Late");
            } else if (totalArrival == totalExam || (totalExam - totalArrival) <= 30) {
                System.out.println("On time");
            }else if((totalExam - totalArrival) > 30){
                System.out.println("Early");
            }

            if(!(totalExam == totalArrival) && (totalExam - totalArrival) < 60 && (totalExam - totalArrival) > 0){
                int min = totalExam - totalArrival;
                System.out.printf("%d minutes before the start",min);
            }else if(!(totalExam == totalArrival) && (totalExam - totalArrival) >= 60){
                int min = totalExam - totalArrival;
                int h = min / 60;
                int m = min % 60;
                if( m< 10){
                System.out.printf("%d:0%d hours before the start",h,m);
                }else {
                    System.out.printf("%d:%d hours before the start",h,m);
                }
            }if(!(totalExam == totalArrival) && (totalArrival - totalExam) < 60 && (totalArrival - totalExam) > 0){
                int min = totalArrival - totalExam;
                System.out.printf("%d minutes after the start",min);
            }else if(!(totalExam == totalArrival) && (totalArrival - totalExam) >= 60){
                int min = totalArrival - totalExam;
                int h = min / 60;
                int m = min % 60;
                if( m< 10){
                System.out.printf("%d:0%d hours after the start",h,m);
                } else{
                    System.out.printf("%d:%d hours after the start",h,m);
                }
            }
        }
    }
}
