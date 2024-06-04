package strategy;

public class Application {
    public static void main(String[] args) {
        MachinePart engine = new MachinePart(new EngineStrategy());
        engine.operate();
    }
}
