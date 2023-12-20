package bg.tu_varna.sit.a2.f22621663.homework10.task3;

class Car {
    private String registrationNumber;
    private Color color;
    private String brand;
    private String model;
    private Fuel fuel;

    public Car(String registrationNumber, Color color, String brand, String model, Fuel fuel) throws CarDataException {
        if (registrationNumber == null || registrationNumber.isEmpty() || color == null || brand == null || brand.isEmpty() || model == null || model.isEmpty() || fuel == null) {
            throw new CarDataException("Invalid car data");
        }
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return String.format("Registration: %s, Color: %s, Brand: %s, Model: %s, Fuel: %s",
                registrationNumber, color, brand, model, fuel);
    }
}
