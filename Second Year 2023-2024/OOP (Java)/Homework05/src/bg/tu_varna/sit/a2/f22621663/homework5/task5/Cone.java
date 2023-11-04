package bg.tu_varna.sit.a2.f22621663.homework5.task5;

class Cone extends Shape implements Area, Volume {
    private double radius;
    private double height;

    public Cone() {
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }





    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }



    
    @Override
    public double calculateVolume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}
