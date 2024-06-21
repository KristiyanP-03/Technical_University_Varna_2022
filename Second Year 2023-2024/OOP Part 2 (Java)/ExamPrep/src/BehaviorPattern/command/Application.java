package BehaviorPattern.command;


public class Application {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Command moveForward = new MoveForwardCommand(robot);
        RobotController controller = new RobotController();
        controller.setCommand(moveForward);
        controller.executeCommand();
    }
}
