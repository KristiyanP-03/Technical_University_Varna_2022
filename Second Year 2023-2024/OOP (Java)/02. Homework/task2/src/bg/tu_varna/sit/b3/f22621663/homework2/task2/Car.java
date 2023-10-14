package bg.tu_varna.sit.b3.f22621663.homework2.task2;
// Imam nujda ot comentari za da si razdelqm koda

public class Car {
    //atributs
    String brand;
    String registrationNumber;
    int mileage;

    //init atributs so I can do "new Car(param1, param2, ...)"
    Car(String brand, String registrationNumber, int mileage){
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.mileage = mileage;
    }


    //get methods for reading
    public String getBrand() {
        return brand;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getMileage() {
        return mileage;
    }
}
