package bg.tu_varna.sit.a2.f22621663.homework10.task3;

class Owner extends Person {
    private String drivingLicense;

    public Owner(String egn, String firstName, String lastName, int age, String drivingLicense) throws PersonalDataException {
        super(egn, firstName, lastName, age);
        this.drivingLicense = drivingLicense != null ? drivingLicense : "none";
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    @Override
    public String toString() {
        return String.format("%s %s - Driving License: %s", getFirstName(), getLastName(), drivingLicense);
    }
}
