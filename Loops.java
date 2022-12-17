public class Loops {

    public static void main(String[] args){

        int[] number = new int[7];
        number[0]=4;
        number[1]=6;
        number[2]=14;
        number[3]=15;
        number[4]=87;
        number[5]=9;
        number[6]=1;


        for(int i=0;i< number.length;i++){

            System.out.print(number[i] + " ");

        }
        System.out.println();

        for (int collect:number) {
            System.out.print(collect + " ");
        }

        System.out.println();

        int first = 35;

        for(int i = 1;i<first;i++){

            if(i % 2 == 0){
                System.out.println("This is even number" + i);
            }else {System.out.println("This is odd number" + i);}
            // System.out.print(i + " ");
        }
    }
}
