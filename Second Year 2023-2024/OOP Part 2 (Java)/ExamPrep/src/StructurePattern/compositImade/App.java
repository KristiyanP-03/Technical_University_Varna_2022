package StructurePattern.compositImade;

public class App {
    public static void main(String[] args) {
        item vrata = new item1();

        Composite comps = new Composite();
        comps.add(vrata);
    }
}
