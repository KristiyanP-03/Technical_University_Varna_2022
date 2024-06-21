package BehaviorPattern.mediator;


public class app {
    public static void main(String[] args) {
        ProcessorMediator mediator = new ProcessorMediatorImpl();
        Processor intel1 = new IntelProcessor("IntelProcessor1", mediator);
        Processor intel2 = new IntelProcessor("IntelProcessor2", mediator);
        Processor amd1 = new AMDProcessor("AMDProcessor1", mediator);
        Processor amd2 = new AMDProcessor("AMDProcessor2", mediator);
        intel1.send("Hello from Intel 1");
        amd1.send("Hi from AMD 1");
        intel2.send("Intel 2 reporting in");
        amd2.send("AMD 2 here");
    }
}
