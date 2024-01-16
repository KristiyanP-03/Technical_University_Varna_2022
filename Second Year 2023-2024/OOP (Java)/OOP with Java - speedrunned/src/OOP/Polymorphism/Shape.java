package OOP.Polymorphism;

public class Shape {
    void calculateArea(){
        System.out.println("Missing <a> and <b>! Method is allowed to be overloaded.");
    }

    double findAreaOfCircle(int r){
        return Math.PI * (r * r);
    }
}
