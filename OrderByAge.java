package orderByAge;

public class OrderByAge {
    private String name;
    private String id;
    private int age;

    public OrderByAge(String name,String id,int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }


    @Override
    public String toString() {
        return this.name + " with ID: " + this.id +" is " + this.age + " years old.";
    }
}
