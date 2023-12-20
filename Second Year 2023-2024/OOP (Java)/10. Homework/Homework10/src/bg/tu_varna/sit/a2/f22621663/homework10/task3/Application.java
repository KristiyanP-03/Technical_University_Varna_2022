package bg.tu_varna.sit.a2.f22621663.homework10.task3;

public class Application {
    public static void main(String[] args) {
        try {
            Owner owner1 = new Owner("1234567890", "Ivan", "Ivanov", 25, "12345");
            Owner owner2 = new Owner("0987654321", "Maria", "Petrova", 30, "54321");

            Car car1 = new Car("ABC123", Color.BLUE, "Toyota", "Corolla", Fuel.PETROL);
            Car car2 = new Car("XYZ789", Color.RED, "Ford", "Focus", Fuel.DIESEL);

            Register register = new Register("Sofia");

            register.addRegistration(car1, owner1);
            register.addRegistration(car2, owner2);

            register.printRegisteredCars();

            System.out.println("Owner of ABC123: " + register.findOwnerByRegistrationNumber("ABC123"));

            System.out.println("Licensed drivers:");
            register.printLicensedDrivers();
        } catch (PersonalDataException | CarDataException e) {
            e.printStackTrace();
        }
    }
}
