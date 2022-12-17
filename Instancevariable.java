public class Instancevariable {
    int c;

    public void addition(){
        int a = 10;
        int b = 20;
        c = a + b;
        System.out.println("The sum of a and b is: " + c);
    }

    public void difference(){
        int d = 15;
        int e = 12;
        c = d - e;
        System.out.println("The difference between d and e is: " + c );
    }

    public static void main(String[] args) {
        Instancevariable var = new Instancevariable();
        var.addition();
        var.difference();
    }
}
