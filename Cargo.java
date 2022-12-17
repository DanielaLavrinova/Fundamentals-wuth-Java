package rawData;

public class Cargo {
    private String type;
    private int weight;

    public Cargo(int weight,String type){
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getType(){
        return this.type;
    }

    /*     for (Tire tire:tiresList) {
                        if(tire.getTyrePressureOne() < 1 || tire.getTyrePressureTwo() < 1 ||
                                tire.getTyrePressureThree() < 1 || tire.getTyrePressureFour() < 1){
                            System.out.println(car.getModel());
                        }
                    }*/
}
