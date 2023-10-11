package bg.tu_varna.sit.a1.f1234567.homework1.task1.task2;

public class Cars {
    String brand;
    String model;
    int year;

    Cars(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Cars myCar = new Cars("ferrari", "Cherveno", 1969);
    }
}
