package abstract_factory_better_example;

public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
