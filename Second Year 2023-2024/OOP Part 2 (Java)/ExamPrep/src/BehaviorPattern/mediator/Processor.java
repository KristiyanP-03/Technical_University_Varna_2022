package BehaviorPattern.mediator;

interface Processor {
    void send(String message);
    void receive(String message);
}
