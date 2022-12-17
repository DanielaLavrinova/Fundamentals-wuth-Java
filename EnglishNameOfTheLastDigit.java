import java.util.Scanner;

public class EnglishNameOfTheLastDigit {

    public String name (String name){
        int number = Integer.parseInt(name);
        int lastDigit = number % 10;
        String last = "";

        switch (lastDigit){

            case 1:
                last = "one";
                break;
            case 2:
                last = "two";
                break;
            case 3:
                last = "three";
                break;
            case 4:
                last = "four";
                break;
            case 5:
                last = "five";
                break;
            case 6:
                last = "six";
                break;
            case 7:
                last = "seven";
                break;
            case 8:
                last = "eight";
                break;
            case 9:
                last = "nine";
                break;
            case 0:
                last = "zero";
                break;
        }

        return last;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String number = scanner.nextLine();
        EnglishNameOfTheLastDigit object = new EnglishNameOfTheLastDigit();
        String lastDigit = object.name(number);
        System.out.println(lastDigit);

    }
}
