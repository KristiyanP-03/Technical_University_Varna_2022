package compositImade;

public class item1 implements item {

    @Override
    public void recolor(String color) {
        System.out.println("This item will be: " + color);
    }
}
