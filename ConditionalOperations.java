public class ConditionalOperations {

    public static void main(String[] args){

        int a= 10;

        int c= (a == 5) ? 20:10;
        System.out.println("The value of c is:" + c);

        c = (a == 10)? 20:10;

        System.out.println("Yhe value of c is:" + c);

        //instanceof

        String name = "Daniela";
        boolean result = name instanceof String;
        System.out.println(result);
    }
}
