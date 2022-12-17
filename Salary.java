import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int salary = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            String website = scanner.next();
            website += scanner.nextLine();

            switch (website){
                case "Facebook":
                    salary = salary -  150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary -  50;
                    break;
            }

            if (salary <= 0){
                System.out.println("You have lost your salary.");
                break;
            }

        }
        if(salary > 0){
            System.out.printf("%d",salary);
        }
    }
}

