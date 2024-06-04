package mediator;

class IntelProcessor implements Processor {
    private String name;
    private ProcessorMediator mediator;
    public IntelProcessor(String name, ProcessorMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addProcessor(this);
    }
    @Override
    public void send(String message) {
        System.out.println(this.name + " sends message: " + message);
        mediator.sendMessage(message, this);
    }
    @Override
    public void receive(String message) {
        System.out.println(this.name + " receives message: " + message);
    }
}
