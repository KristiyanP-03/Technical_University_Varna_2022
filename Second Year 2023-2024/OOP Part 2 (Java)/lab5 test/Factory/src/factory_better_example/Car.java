package factory_better_example;

public class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving ...");
    }
}
