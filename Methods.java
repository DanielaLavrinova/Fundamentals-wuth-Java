import java.util.Scanner;

public class Methods {
    String name = "Daniela"; // instance vaieable can be call only in nan static methods

    public static void main(String[] args) {
         System.out.println("How to understand the methods?" );
         display();
         Methods example = new Methods();
         example.greet();;
         displayRankPoints();

         String name = returnName();
         System.out.println();
         System.out.println("Hello " + name);

    }

    public static void display(){

        System.out.println("This is a static method,no need of object reference!");
    }

    public void greet(){
        System.out.println("Non static method,I need object reference to call it!");
        System.out.println(name);
    }

    public static void displayRankPoints(){
        System.out.print("Please enter your points: ");
        Scanner scanner = new Scanner(System.in);
        double points = scanner.nextDouble();

        if (points > 199){
            System.out.print("Your rank is Rank 'A'");
        }else if(points > 155){
            System.out.print("Your rank is Rank 'B'");
        }else
            System.out.print("You don't have a rank!");
    }

    public static String returnName(){
        String name = "Daniela";
        return name;
    }
}
