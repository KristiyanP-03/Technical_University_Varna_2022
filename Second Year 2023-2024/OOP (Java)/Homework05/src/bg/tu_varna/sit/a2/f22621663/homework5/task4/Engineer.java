package bg.tu_varna.sit.a2.f22621663.homework5.task4;

class Engineer extends Employee {
    private int numberOfMachines;


    public Engineer(String firstName, String secondName, String thirdName, String gender, int age, double worksHours, double rate, int numberOfMachines) {
        super(firstName, secondName, thirdName, gender, age, worksHours, rate);
        this.numberOfMachines = numberOfMachines;
    }


    @Override
    public double calculate() {
        double baseSalary = super.calculate();
        double additionalSalary = baseSalary * (numberOfMachines * 0.001);
        return baseSalary + additionalSalary;
    }
}