public class Employee {
    public double salary;
    public final int days = 22;

    Employee(double salary){
        this.salary = salary;
    }


    double calculateSalary(){
        return this.salary;
    }

    double calculateSalary(double bonus){
        return this.salary + ( this.salary * (bonus/100));
    }

    double calculateSalary(int days){
        return (this.salary / days) * (22 - days);
    }
}
