package bg.tu_varna.sit.b3.f22621663.homework3.task5;

public class Bus extends Car {
    private int numberOfSeats;
    private int coursesTraveled;

    public Bus(String brand, String model, int color, int power, String engineType, String gearboxType, int yearOfManufacture, int numberOfSeats) {
        super(brand, model, color, power, engineType, gearboxType, yearOfManufacture);
        this.numberOfSeats = numberOfSeats;
        this.coursesTraveled = 0;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public int getCoursesTraveled() {
        return coursesTraveled;
    }


    public void incrementCourses() {
        coursesTraveled++;
    }


    public boolean isLimitExceeded() {
        int dailyLimit = 10;
        int remainingLimit = dailyLimit - (coursesTraveled % dailyLimit);
        return remainingLimit <= 5;
    }
}