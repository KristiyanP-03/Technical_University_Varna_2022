package bg.tu_varna.sit.а2.f22621663;

public class Circle implements Shape {
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle: " + name);
    }

    @Override
    public void resize(int factor) {
        System.out.println("Resizing Circle: " + name + " by " + factor);
    }

    @Override
    public String description() {
        return "Circle: " + name;
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
