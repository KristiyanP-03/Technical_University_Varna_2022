package CreationPattern.Factory;

public class main {
    public static void main(String[] args) {
        ColorFactory colorFactory = new ColorFactory();

        // Създаваме червен цвят и го запълваме
        Color red = colorFactory.getColor("Red");
        red.fill();

    }
}
