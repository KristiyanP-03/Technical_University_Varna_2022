package decorator;

public class Main {
    public static void main(String[] args) {
        Wall simpleWall = new SimpleWall();
        simpleWall.build();

        Wall paintedWall = new PaintedWallDecorator(new SimpleWall());
        paintedWall.build();

    }
}