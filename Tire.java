package rawData;

public class Tire {
    private double tyrePressureOne;
    private int tyreAgeOne;
    private double tyrePressureTwo;
    private int tyreAgeTwo;
    private double tyrePressureThree;
    private int tyreAgeThree;
    private double tyrePressureFour;
    private int tyreAgeFour;

    public Tire(double tyrePressureOne,int tyreAgeOne,double tyrePressureTwo,int tyreAgeTwo,
                double tyrePressureThree,int tyreAgeThree,double tyrePressureFour,int tyreAgeFour){

        this.tyrePressureOne = tyrePressureOne;
        this.tyreAgeOne = tyreAgeOne;
        this.tyrePressureTwo = tyrePressureTwo;
        this.tyreAgeTwo = tyreAgeTwo;
        this.tyrePressureThree = tyrePressureThree;
        this.tyreAgeThree = tyreAgeThree;
        this.tyrePressureFour = tyrePressureFour;
        this.tyreAgeFour = tyreAgeFour;

    }

    public void setTyrePressureOne(double tyrePressureOne) {
        this.tyrePressureOne = tyrePressureOne;
    }

    public void setTyrePressureTwo(double tyrePressureTwo) {
        this.tyrePressureTwo = tyrePressureTwo;
    }

    public void setTyrePressureThree(double tyrePressureThree){
        this.tyrePressureThree = tyrePressureThree;
    }

    public void setTyreAgeFour(int tyreAgeFour) {
        this.tyreAgeFour = tyreAgeFour;
    }

    public void setTyreAgeOne(int tyreAgeOne) {
        this.tyreAgeOne = tyreAgeOne;
    }

    public void setTyreAgeTwo(int tyreAgeTwo) {
        this.tyreAgeTwo = tyreAgeTwo;
    }

    public void setTyreAgeThree(int tyreAgeThree) {
        this.tyreAgeThree = tyreAgeThree;
    }

    public void setTyrePressureFour(double tyrePressureFour) {
        this.tyrePressureFour = tyrePressureFour;
    }

    public double getTyrePressureOne() {
        return this.tyrePressureOne;
    }

    public double getTyrePressureTwo() {
        return this.tyrePressureTwo;
    }

    public double getTyrePressureThree() {
        return this.tyrePressureThree;
    }

    public double getTyrePressureFour() {
        return this.tyrePressureFour;
    }

    public int getTyreAgeOne() {
        return this.tyreAgeOne;
    }

    public int getTyreAgeTwo() {
        return this.tyreAgeTwo;
    }

    public int getTyreAgeThree() {
        return this.tyreAgeThree;
    }

    public int getTyreAgeFour() {
        return this.tyreAgeFour;
    }
}
