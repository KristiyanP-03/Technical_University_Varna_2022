package OOP.Abstraction;

public class App {
    public static void main(String[] args) {
        SportsCar audiR8 = new SportsCar();

        Tank T2B = new Tank();


        System.out.println(audiR8.classVehicle());
        System.out.println(T2B.classVehicle());


        System.out.println(audiR8.vehicleDescription());
        System.out.println(T2B.vehicleDescription());
    }
}
