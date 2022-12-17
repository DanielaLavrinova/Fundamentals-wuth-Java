public class Dog {

    int age;
    String name;
    String breed;

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){

        return name;
    }

    public void setBreed(String b){

        breed = b;
    }

    public String getBreed(){
        return breed;
    }

    public static void main(String[] args){

        Dog dog1= new Dog();
        dog1.setAge(12);
        System.out.println(dog1.getAge());

        dog1.setName("Willy");
        System.out.println(dog1.getName());

        dog1.setBreed("Pomeranian");
        System.out.println(dog1.getBreed()
        );

    }
}
