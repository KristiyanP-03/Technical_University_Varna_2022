package OOP.Polymorphism;

public class Square extends Shape{
    void calculateArea(int a, int b){
        int area = a * b;
        System.out.println("The area of the square is: " + area);
    }
}
