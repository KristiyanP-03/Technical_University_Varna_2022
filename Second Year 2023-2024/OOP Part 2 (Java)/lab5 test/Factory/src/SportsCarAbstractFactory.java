// Фабрика на фабрики за производство на спортни автомобили
class SportsCarAbstractFactory extends AbstractCarFactory {
    @Override
    public CarFactory createCarFactory() {
        return new SportsCarFactory();
    }
}
