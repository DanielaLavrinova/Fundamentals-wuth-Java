public class Forloop {
    public static void main(String[] args) {

        for(int x = 6; x <= 13; x++){
             System.out.println("x is " + x);
         }
        System.out.println("For loop is over");

        for(int y = 10;y <= 20;y++){
            if(y == 15){
               break;
            }
            System.out.println(y);
        }

        int[] numbers = {5,10,15,20,25};

        for (int i:numbers) {
           if(i == 20){
               break;
           }
           System.out.println(i);
        }

        String[] names = {"Petar","Aviva","Willy"};

        for (String n:names) {
            System.out.print(n);
            System.out.print(",");
        }
    }
}
