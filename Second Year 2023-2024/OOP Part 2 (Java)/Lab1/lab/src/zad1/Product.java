package zad1;

public class Product {
    private String name;
    private double storageTemperature;



    public Product(String name, double storageTemperature) {
        this.name = name;
        this.storageTemperature = storageTemperature;
    }




    public String getName() {
        return name;
    }

    public double getStorageTemperature() {
        return storageTemperature;
    }
}
