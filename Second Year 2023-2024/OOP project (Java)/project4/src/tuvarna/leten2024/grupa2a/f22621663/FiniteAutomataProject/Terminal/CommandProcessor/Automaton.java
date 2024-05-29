package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor;


import java.util.List;



public class Automaton {
    private final List<Transition> transitions;
    public Automaton(List<Transition> transitions) {
        this.transitions = transitions;
    }
    public List<Transition> getTransitions() {
        return transitions;
    }


    public static class Transition {
        private final int fromState;
        private final char symbol;
        private final int toState;

        public Transition(int fromState, char symbol, int toState) {
            this.fromState = fromState;
            this.symbol = symbol;
            this.toState = toState;
        }
        public int getFromState() {
            return fromState;
        }
        public char getSymbol() {
            return symbol;
        }
        public int getToState() {
            return toState;
        }
    }
}