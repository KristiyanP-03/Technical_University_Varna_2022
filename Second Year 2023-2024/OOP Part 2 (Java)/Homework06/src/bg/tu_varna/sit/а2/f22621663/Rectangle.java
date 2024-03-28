package bg.tu_varna.sit.а2.f22621663;

public class Rectangle implements Shape {
    private String name;

    public Rectangle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle: " + name);
    }

    @Override
    public void resize(int factor) {
        System.out.println("Resizing Rectangle: " + name + " by factor " + factor);
    }

    @Override
    public String description() {
        return "Rectangle: " + name;
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
