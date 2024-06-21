package BehaviorPattern.state;


class LampOnState implements State {
    @Override
    public void doAction() {
        System.out.println("The lamp is now ON.");
    }
}
