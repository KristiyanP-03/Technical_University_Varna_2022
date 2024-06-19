package BehaviorPattern.state;


public class LampStateDemo {
    public static void main(String[] args) {
        LampContext context = new LampContext();
        State lampOnState = new LampOnState();
        State lampOffState = new LampOffState();
        context.setState(lampOnState);
        context.doAction();
        context.setState(lampOffState);
        context.doAction();
    }
}
