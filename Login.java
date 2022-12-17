import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String reverse = new StringBuffer(username).reverse().toString();
        int counter = 0;
        boolean flag = false;
        String password = scanner.nextLine();

        while(!password.equals(reverse)){

            counter ++;

            if(counter == 4){
                flag = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");

            password = scanner.nextLine();


        }

        if(flag){
            System.out.printf("User %s blocked!",username);
        }else{
            System.out.printf("User %s logged in.",username);
        }

    }
}
