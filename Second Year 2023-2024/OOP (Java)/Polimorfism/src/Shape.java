public abstract class Shape {
    double a;
    double b;

    Shape(double a, double b){
        this.a = a;
        this.b = b;
    }

    public abstract double calculateSurface();

    public String toString(){
        return "";
    }


}
