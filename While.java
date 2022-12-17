public class While {
    public static void main(String[] args) {

        int x = 7;

        while(x < 10){
            System.out.println("The value of x is: " + x);
            x++;
        }

        System.out.println("Finally x is: " + x);

        // do while loop
        int y = 5;

        do{
            System.out.println("The value of y is: " + y);
            y++;
        }while(y<10);

        // continue
        int z = 12;

        while(z<20){
            if(z == 17){
                z++;
                continue;
            }
            System.out.println(z);
            z++;
        }

        int a = 10;
        while (a < 15){
            System.out.println("A is " + a);
            a++;
            if(a == 13){
                break;
            }
        }

    }
}
