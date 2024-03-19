// Фабрика за производство на SUV-ове
class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUV();
    }
}
