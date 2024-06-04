package state;


class LampOffState implements State {
    @Override
    public void doAction() {
        System.out.println("The lamp is now OFF.");
    }
}
