package factory_better_example;

public class Main {
    public static void main(String[] args) {
        // Създаване на фабрика за производство на коли
        CarFactory carFactory = new CarFactory();

        // Използване на фабричния метод за създаване на кола
        Car car = carFactory.create();

        // Управление на колата
        car.drive();
    }
}
