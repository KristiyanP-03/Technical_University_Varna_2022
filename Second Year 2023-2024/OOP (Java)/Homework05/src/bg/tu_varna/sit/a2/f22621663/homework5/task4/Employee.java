package bg.tu_varna.sit.a2.f22621663.homework5.task4;

class Employee extends Human implements Salary {
    private double worksHours;
    private double rate;

    public Employee(String firstName, String secondName, String thirdName, String gender, int age, double worksHours, double rate) {
        super(firstName, secondName, thirdName, gender, age);
        this.worksHours = worksHours;
        this.rate = rate;
    }

    @Override
    public double calculate() {
        return worksHours * rate;
    }
}