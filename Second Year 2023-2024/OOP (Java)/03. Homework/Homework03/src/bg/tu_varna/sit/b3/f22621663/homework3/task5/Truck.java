package bg.tu_varna.sit.b3.f22621663.homework3.task5;

public class Truck extends Car {
    private int loadCapacity;
    private double elapsedTime;


    public Truck(String brand, String model, int color, int power, String engineType, String gearboxType, int yearOfManufacture, int loadCapacity) {
        super(brand, model, color, power, engineType, gearboxType, yearOfManufacture);
        this.loadCapacity = loadCapacity;
        this.elapsedTime = 0.0;
    }


    public int getLoadCapacity() {
        return loadCapacity;
    }
    public double getElapsedTime() {
        return elapsedTime;
    }


    public void setElapsedTime(double elapsedTime) {
        this.elapsedTime = elapsedTime;
    }


    public boolean checkIfCanBeStarted() {
        return elapsedTime < 6.0;
    }
}

