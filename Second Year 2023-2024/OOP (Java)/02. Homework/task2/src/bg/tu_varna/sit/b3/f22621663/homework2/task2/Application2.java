package bg.tu_varna.sit.b3.f22621663.homework2.task2;

public class Application2 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Mazda 323F", "В 1234 ТХ", 141000);
        cars[1] = new Car("BMW 630i", "ОВ 4444 ТХ", 157000);
        cars[2] = new Car("infinity QX70", "ТХ 6666 В", 110000);

        Autopark autoPark = new Autopark(cars);

        Car carWithMinMileage = autoPark.getCarWithMinMileage();

        System.out.println("Less driven car is:");
        System.out.println("Brand: " + carWithMinMileage.getBrand());
        System.out.println("Registration Number: " + carWithMinMileage.getRegistrationNumber());
        System.out.println("Mileage: " + carWithMinMileage.getMileage());
    }
}
