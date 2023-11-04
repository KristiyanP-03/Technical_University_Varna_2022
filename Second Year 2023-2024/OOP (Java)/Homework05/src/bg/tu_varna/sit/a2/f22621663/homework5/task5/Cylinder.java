package bg.tu_varna.sit.a2.f22621663.homework5.task5;

class Cylinder extends Shape implements Area, Volume {
    private double radius;
    private double height;


    public Cylinder() {
        this.radius = 0.0;
        this.height = 0.0;
    }


    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }




    @Override
    public double calculateArea() {
        return 2.0 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}