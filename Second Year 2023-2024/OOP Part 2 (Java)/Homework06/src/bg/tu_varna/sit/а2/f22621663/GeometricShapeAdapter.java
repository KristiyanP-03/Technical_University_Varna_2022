package bg.tu_varna.sit.а2.f22621663;

public class GeometricShapeAdapter implements Shape {
    private GeometricShape shape;

    public GeometricShapeAdapter(GeometricShape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.drawShape();
    }

    @Override
    public void resize(int factor) {
        System.out.println("Resizing");
    }

    @Override
    public String description() {
        return "GeometricShapeAdapter";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
