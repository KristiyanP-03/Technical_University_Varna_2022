package bg.tu_varna.sit.a2.f22621663.homework5.task5;

class Circle extends Shape implements Area {
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }




    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}