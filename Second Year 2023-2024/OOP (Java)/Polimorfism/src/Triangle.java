public class Triangle extends Shape{
    Triangle(double a, double b){
        super( a, b);
    }
    @Override
    public double calculateSurface() {
        return (a * b)/2;
    }
}
