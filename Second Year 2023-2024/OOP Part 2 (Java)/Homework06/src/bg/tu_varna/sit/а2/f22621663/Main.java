package bg.tu_varna.sit.а2.f22621663;

public class Main {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle("Triangle");
        GeometricShape rhombus = new Rhombus("Rhombus");
        Shape triangleAdapter = new GeometricShapeAdapter(triangle);
        Shape rhombusAdapter = new GeometricShapeAdapter(rhombus);

        drawAndResize(triangleAdapter);
        drawAndResize(rhombusAdapter);
    }

    public static void drawAndResize(Shape shape) {
        shape.draw();
        shape.resize(2);
    }
}
