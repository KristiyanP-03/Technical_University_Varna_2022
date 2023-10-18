package bg.tu_varna.sit.b3.f22621663.homework2.task2;

class Autopark {
    private Car[] cars;

    public Autopark(Car[] cars) {
        this.cars = cars;
    }

    public Car getCarWithMinMileage() {

        Car carWithMinMileage = cars[0];
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getMileage() < carWithMinMileage.getMileage()) {
                carWithMinMileage = cars[i];
            }
        }

        return carWithMinMileage;
    }
}
