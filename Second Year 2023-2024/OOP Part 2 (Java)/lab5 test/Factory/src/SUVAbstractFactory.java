// Фабрика на фабрики за производство на SUV-ове
class SUVAbstractFactory extends AbstractCarFactory {
    @Override
    public CarFactory createCarFactory() {
        return new SUVFactory();
    }
}
