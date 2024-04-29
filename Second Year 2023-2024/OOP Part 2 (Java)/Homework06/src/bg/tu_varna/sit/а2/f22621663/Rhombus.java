package bg.tu_varna.sit.а2.f22621663;

public class Rhombus implements GeometricShape {
    private String name;

    public Rhombus(String name) {
        this.name = name;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing Rhombus: " + name);
    }
}
