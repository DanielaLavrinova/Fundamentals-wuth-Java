public class Switch {

    public static void main(String[] args) {

        char grade = 'E';

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }

        System.out.println("Your grade is: " + grade);
    }
}
