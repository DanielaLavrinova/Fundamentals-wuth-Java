package rawData;

public class Engine {
    private int engineASpeed;
    private int enginePower;

    public Engine(int engineASpeed,int enginePower){
        this.engineASpeed = engineASpeed;
        this.enginePower = enginePower;
    }

    public int getEngineASpeed() {
        return this.engineASpeed;
    }

    public int getEnginePower() {
        return this.enginePower;
    }
}
