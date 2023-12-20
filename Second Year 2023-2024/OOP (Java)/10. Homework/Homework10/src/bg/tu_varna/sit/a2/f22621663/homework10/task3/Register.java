package bg.tu_varna.sit.a2.f22621663.homework10.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Register {
    private String unit;
    private Map<Car, Owner> registeredCars;

    public Register(String unit) {
        this.unit = unit;
        this.registeredCars = new HashMap<>();
    }

    public void addRegistration(Car car, Owner owner) {
        registeredCars.put(car, owner);
    }

    public void printRegisteredCars() {
        for (Car car : registeredCars.keySet()) {
            System.out.println(car.toString());
        }
    }

    public String findOwnerByRegistrationNumber(String registrationNumber) {
        for (Map.Entry<Car, Owner> entry : registeredCars.entrySet()) {
            if (entry.getKey().getRegistrationNumber().equals(registrationNumber)) {
                return entry.getValue().getFirstName() + " " + entry.getValue().getLastName();
            }
        }
        return "Not found";
    }

    public void printLicensedDrivers() {
        List<String> uniqueDrivers = new ArrayList<>();
        for (Owner owner : registeredCars.values()) {
            if (owner.hasCompetence() && !uniqueDrivers.contains(owner.toString())) {
                uniqueDrivers.add(owner.toString());
            }
        }
        for (String driver : uniqueDrivers) {
            System.out.println(driver);
        }
    }
}
