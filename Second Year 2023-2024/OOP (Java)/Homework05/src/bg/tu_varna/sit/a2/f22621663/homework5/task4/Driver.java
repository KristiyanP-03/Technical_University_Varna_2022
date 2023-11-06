package bg.tu_varna.sit.a2.f22621663.homework5.task4;

class Driver extends Employee {
    private DrivingLicense drivingLicense;
    private int courses;


    public Driver(String firstName, String secondName, String thirdName, String gender, int age, double worksHours, double rate, DrivingLicense drivingLicense, int courses) {
        super(firstName, secondName, thirdName, gender, age, worksHours, rate);
        this.drivingLicense = drivingLicense;
        this.courses = courses;
    }


    @Override
    public double calculate() {
        double baseSalary = super.calculate();
        if (courses > 10) {
            return baseSalary * 1.05;
        }
        return baseSalary;
    }
}