package mediator;

import java.util.ArrayList;
import java.util.List;

class ProcessorMediatorImpl implements ProcessorMediator {
    private List<Processor> processors;

    public ProcessorMediatorImpl() {
        this.processors = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Processor sender) {
        for (Processor processor : processors) {
            // Не изпращаме съобщението обратно на изпращача
            if (processor != sender) {
                processor.receive(message);
            }
        }
    }

    @Override
    public void addProcessor(Processor processor) {
        this.processors.add(processor);
    }
}
