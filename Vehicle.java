public class Vehicle {
    private String typeOfVehicle;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String typeOfVehicle,String model,String color,int horsepower){
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;

    }

    public String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        if(typeOfVehicle.equals("car")){
            typeOfVehicle = "Car";
        }
        if(typeOfVehicle.equals("truck")){
            typeOfVehicle = "Truck";
        }

        return "Type: "+ typeOfVehicle + "\n" + "Model: " + model + "\n" +
                "Color: " + color + "\n" + "Horsepower: " + horsepower ;
    }
}
