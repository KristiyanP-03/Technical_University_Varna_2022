package abstract_factory_better_example;

public class Main {
    public static void main(String[] args) {
        // Избиране на фабрика за производство на превозни средства
        VehicleFactory factory = new CarFactory();

        // Използване на абстрактната фабрика за създаване на кола или камион
        Vehicle vehicle = factory.createVehicle();

        // Управление на превозното средство
        vehicle.drive();
    }
}
