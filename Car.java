package carSalesman;

public class Car {
    private String model;
    private int weight;
    private String color;

    public Car(String model,Engine engine,int weight,String color){
        this.model = model;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }
}
