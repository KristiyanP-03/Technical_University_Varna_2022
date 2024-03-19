// Фабрика за производство на спортни автомобили
class SportsCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SportsCar();
    }
}
