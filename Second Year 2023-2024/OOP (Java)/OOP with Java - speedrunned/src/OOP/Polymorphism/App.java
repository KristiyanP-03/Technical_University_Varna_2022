package OOP.Polymorphism;

public class App {
    public static void main(String[] args) {
        Square myOverloadingExample = new Square();

        myOverloadingExample.calculateArea();
        myOverloadingExample.calculateArea(5, 4);



        Shape myOverridingExamplePart1 = new Shape();
        System.out.println(
            myOverridingExamplePart1.findAreaOfCircle(4)
        );

        Circle myOverridingExamplePart2 = new Circle();
        System.out.println(
            myOverridingExamplePart2.findAreaOfCircle(3)
        );
    }
}
