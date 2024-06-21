package BehaviorPattern.command;


class MoveForwardCommand implements Command {
    private Robot robot;
    public MoveForwardCommand(Robot robot) {
        this.robot = robot;
    }
    @Override
    public void execute() {
        robot.moveForward();
    }
}
