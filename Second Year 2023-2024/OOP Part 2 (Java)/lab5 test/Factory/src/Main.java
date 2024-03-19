// Тестване на програмата
public class Main {
    public static void main(String[] args) {
        // Създаване на фабрика за производство на спортни автомобили
        AbstractCarFactory sportsCarAbstractFactory = new SportsCarAbstractFactory();
        CarFactory sportsCarFactory = sportsCarAbstractFactory.createCarFactory();
        Car sportsCar = sportsCarFactory.createCar();
        System.out.println("Тип на автомобила: " + sportsCar.getType());

        // Създаване на фабрика за производство на SUV-ове
        AbstractCarFactory suvAbstractFactory = new SUVAbstractFactory();
        CarFactory suvFactory = suvAbstractFactory.createCarFactory();
        Car suv = suvFactory.createCar();
        System.out.println("Тип на автомобила: " + suv.getType());
    }
}
