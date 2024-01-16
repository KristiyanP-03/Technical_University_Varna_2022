package OOP.Polymorphism;

public class Circle extends Shape{
    @Override
    double findAreaOfCircle(int r) {
        System.out.println("--- The Area of the Circle is ---");
        return super.findAreaOfCircle(r);
    }
}
