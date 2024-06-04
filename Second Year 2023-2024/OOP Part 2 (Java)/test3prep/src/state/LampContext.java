package state;


class LampContext {
    private State lampState;
    public void setState(State state) {
        this.lampState = state;
    }
    public State getState() {
        return this.lampState;
    }
    public void doAction() {
        this.lampState.doAction();
    }
}
