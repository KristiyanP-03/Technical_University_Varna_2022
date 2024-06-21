package BehaviorPattern.command;


class RobotController {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        this.command.execute();
    }
}
