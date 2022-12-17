package rawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int engineSpeed;
    private int enginePower;

    private int cargoWeight;

    private String cargoType;
    private List<Tire> tiresList;

    public Car(String model,int engineSpeed,int enginePower,int cargoWeight,String cargoType,List<Tire> tiresList) {
        this.model = model;
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
        this.tiresList = tiresList;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public void setTiresList(ArrayList<Tire> tiresList) {
        this.tiresList = tiresList;
    }

    public String getModel() {
        return this.model;
    }

    public int getEngineSpeed() {
        return this.engineSpeed;
    }

    public int getEnginePower() {
        return this.enginePower;
    }

    public int getCargoWeight() {
        return this.cargoWeight;
    }

    public String getCargoType() {
        return this.cargoType;
    }

    public List<Tire> getTiresList() {
        return this.tiresList;
    }
}
