package mediator;

interface ProcessorMediator {
    void sendMessage(String message, Processor sender);
    void addProcessor(Processor processor);
}
